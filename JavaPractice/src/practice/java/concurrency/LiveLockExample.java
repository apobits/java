package practice.java.concurrency;

public class LiveLockExample {

    public static void main(String[] args) {
	var personOne = new Person("Albin", true, 0);
	var personTwo = new Person("Marcela", false, 0);

	var corridor = new Corridor(personOne, personTwo);

	var threadOne = new Thread(() -> personOne.move(corridor), "ThreadOne");
	var threadTwo = new Thread(() -> personTwo.move(corridor), "ThreadTwo");

	threadOne.start();
	threadTwo.start();
    }

    static class Corridor implements Cloneable {
	private final String LEFT = "left";
	private final String RIGHT = "right";
	private volatile Person backLeft;
	private volatile Person frontLeft;
	private volatile Person backRight;
	private volatile Person frontRight;

	public Corridor() {

	}

	public Corridor(Person personAtBack, Person personAtFront) {
	    backLeft = personAtBack;
	    frontLeft = personAtFront;
	    print(backLeft, LEFT);
	    print(frontLeft, LEFT);
	}

	public Person getBackLeft() {
	    return backLeft;
	}

	public void setBackLeft(Person backLeft) {
	    this.backLeft = backLeft;
	}

	public Person getFrontLeft() {
	    return frontLeft;
	}

	public void setFrontLeft(Person frontLeft) {
	    this.frontLeft = frontLeft;
	}

	public Person getBackRight() {
	    return backRight;
	}

	public void setBackRight(Person backRight) {
	    this.backRight = backRight;
	}

	public Person getFrontRight() {
	    return frontRight;
	}

	public void setFrontRight(Person frontRight) {
	    this.frontRight = frontRight;
	}

	public synchronized void moveBackLeft(Person person) throws InterruptedException {
	    print(person, LEFT);
	    backLeft = person;
	    backRight = null;
	    //	    Thread.sleep(3000);
	}

	public synchronized void moveBackRight(Person person) throws InterruptedException {
	    print(person, RIGHT);
	    backRight = person;
	    backLeft = null;
	    //	    Thread.sleep(3000);
	}

	public synchronized void moveFrontLeft(Person person) throws InterruptedException {
	    print(person, LEFT);
	    frontLeft = person;
	    frontRight = null;
	    //	    Thread.sleep(3000);
	}

	public synchronized void moveFrontRight(Person person) throws InterruptedException {
	    print(person, RIGHT);
	    frontRight = person;
	    frontLeft = null;
	    //	    Thread.sleep(3000);
	}

	private void print(Person person, String side) {
	    System.out.printf("[%s] %s moved %s%n", Thread.currentThread().getName(), person.getName(), side);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	    var corridorCopy = (Corridor) super.clone();
	    corridorCopy.setBackLeft(
			    this.getBackLeft() != null ? (Person) this.getBackLeft().clone() : this.getBackLeft());
	    corridorCopy.setFrontLeft(
			    this.getFrontLeft() != null ? (Person) this.getFrontLeft().clone() : this.getFrontLeft());
	    corridorCopy.setBackRight(
			    this.getBackRight() != null ? (Person) this.getBackRight().clone() : this.getBackRight());
	    corridorCopy.setFrontRight(this.getFrontRight() != null ?
			    (Person) this.getFrontRight().clone() :
			    this.getFrontRight());
	    return corridorCopy;
	}
    }

    static class Person implements Cloneable {

	private String name;

	private boolean back;

	private long agility;

	public Person(String name, boolean back, long agility) {
	    this.name = name;
	    this.back = back;
	    this.agility = agility;
	}

	public String getName() {
	    return name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}

	public synchronized void move(Corridor corridor) {
	    while ((corridor.getBackLeft() != null && corridor.getFrontLeft() != null) || (
			    corridor.getBackRight() != null && corridor.getFrontRight() != null)) {
		try {
		    var corridorTemp = (Corridor) corridor.clone();
		    if (back) {
			if (corridorTemp.getFrontLeft() != null) {
			    corridor.moveBackRight(this);
			} else {
			    corridor.moveBackLeft(this);
			}
		    } else {
			if (corridorTemp.getBackLeft() != null) {
			    corridor.moveFrontRight(this);
			} else {
			    corridor.moveFrontLeft(this);
			}
		    }
		} catch (InterruptedException | CloneNotSupportedException e) {
		    e.printStackTrace();
		}
	    }
	}
    }

}
