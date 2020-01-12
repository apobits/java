package practice.java.concurrency;

public class DeadLockExample {

    public static void main(String[] args) {
	var friendOne = new Friend("FriendOne");
	var friendTwo = new Friend("FriendTwo");
	var threadOne = new Thread(() -> friendOne.bow(friendTwo));
	var threadTwo = new Thread(() -> friendTwo.bow(friendOne));
	threadOne.start();
	threadTwo.start();
    }

    static class Friend {
	private String name;

	public Friend(String name) {
	    this.name = name;
	}

	public synchronized void bow(Friend friend) {
	    System.out.printf("%s bows to %s %n", this.name, friend.getName());
	    friend.bowBack(this);
	}

	public synchronized void bowBack(Friend friend) {
	    System.out.printf("%s bows back to %s %n", this.name, friend.getName());
	}

	public String getName() {
	    return name;
	}
    }

}
