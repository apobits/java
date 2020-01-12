package practice.java.concurrency;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StarvationExample {

    public static void main(String[] args) throws InterruptedException {
	var phoneBook = new PhoneBook();
	Runnable printPhones = phoneBook::printPhones;
	Runnable addPones = () -> phoneBook.addPhoneBook("Hasley", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));

	ExecutorService executorService = Executors.newFixedThreadPool(5);
	executorService.execute(printPhones);
	executorService.execute(printPhones);
	executorService.execute(addPones);
	executorService.execute(printPhones);

	executorService.awaitTermination(60000, TimeUnit.MILLISECONDS);

    }

    static class PhoneBook {

	private Map<String, List<Integer>> phoneBook;

	public PhoneBook() {
	    phoneBook = new HashMap<>();
	    phoneBook.put("Albin", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	    phoneBook.put("Danna", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	    phoneBook.put("Wife", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	    phoneBook.put("Aunt", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	    phoneBook.put("Mom", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	    phoneBook.put("Dad", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
	}

	public synchronized void printPhones() {
	    for (var phones : phoneBook.entrySet()) {
		System.out.printf("Thread: %s %s's numbers are %s%n", Thread.currentThread().getName(), phones.getKey(),
				phones.getValue());
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	}

	public synchronized void addPhoneBook(String name, List<Integer> phones) {
	    System.out.printf("%s: Adding phones register%n", Thread.currentThread().getName());
	    phoneBook.putIfAbsent(name, phones);
	}

    }

}
