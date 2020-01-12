package practice.java.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSolutionExample {

    public static void main(String[] args) {
	var friendOne = new Person("Albin");
	var friendTwo = new Person("Marcela");

	Runnable friendOneBow = () -> {
	    for (int i = 0; i < 10; i++) {
		friendOne.bow(friendTwo);
	    }
	};
	Runnable friendTwoBow = () -> {
	    for (int i = 0; i < 10; i++) {
		friendTwo.bow(friendOne);
	    }
	};

	(new Thread(friendOneBow)).start();
	(new Thread(friendTwoBow)).start();

    }

    static class Person {
	public final Lock lock = new ReentrantLock();
	private final String name;

	public Person(String name) {
	    this.name = name;
	}

	public void bow(Person person) {
	    if (acquireLocks(person)) {
		try {
		    System.out.printf("%s bows to %s%n", this.name, person.name);
		    person.bowBack(this);
		} finally {
		    lock.unlock();
		    person.lock.unlock();
		}
	    }
	}

	private void bowBack(Person person) {
	    System.out.printf("%s bows back to %s%n", this.name, person.name);
	}

	private boolean acquireLocks(Person person) {
	    boolean ownLock = lock.tryLock();
	    boolean friendLock = person.lock.tryLock();

	    if (ownLock && friendLock) {
		return true;
	    } else {
		if (ownLock) {
		    lock.unlock();
		}
		if (friendLock) {
		    person.lock.unlock();
		}
		return false;
	    }
	}
    }

}
