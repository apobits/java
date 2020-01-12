package practice.java.concurrency;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    //check CopyOnWriteArrayList for examples and explanation as the same logic applies to CopyOnWriteArraySet
    private static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    public static void main(String[] args) {
	set.add(1);
	var it1 = set.iterator();

	set.add(2);
	var it2 = set.iterator();

	while (it1.hasNext()) {
	    System.out.print(it1.next() + " ");
	}
	System.out.println();

	while (it2.hasNext()) {
	    System.out.println(it2.next() + " ");
	}
    }

}
