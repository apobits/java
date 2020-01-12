package practice.java.concurrency;

import ortiz.perez.albin.generics.D;

import java.util.Date;

public class QueueExample {

    public static void main(String[] args) throws InterruptedException {
	var queue = new Queue();
	Runnable producer = () -> {
	    for (int i = 0; i < 10; i++) {
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		queue.offer((new Date()).toString());
	    }
	};

	Runnable consumer = () -> {
	    for (int i = 0; i < 10; i++) {
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.println(queue.poll());
	    }
	};

	var producerThread = new Thread(producer, "ProducerThread");
	var consumerThread = new Thread(consumer, "ConsumerThread");

	producerThread.start();
	Thread.sleep(1000);
	consumerThread.start();
    }

    static class Queue {
	private String data;

	public synchronized void offer(String data) {
	    while (this.data != null) {
		try {
		    wait();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	    this.data = data;
	    notifyAll();
	}

	public synchronized boolean hasData() {
	    return data != null;
	}

	public synchronized String poll() {
	    while (data == null) {
		try {
		    wait();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	    String temp = data;
	    data = null;
	    notifyAll();
	    return temp;
	}
    }

}
