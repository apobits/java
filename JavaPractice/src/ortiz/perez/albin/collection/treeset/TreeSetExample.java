package ortiz.perez.albin.collection.treeset;

import java.util.TreeSet;

public class TreeSetExample {

	public static void treeSet() {
		// NavigationSet implementation
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(2);

		// subSet from(inclusive) to(exclusive)
		treeSet.subSet(2, 4);

		// subSet from(inclusive) to(inclusive)
		treeSet.subSet(2, true, 4, true);

		// subSet starts at the beginning of the set until the element before the
		// specified argument
		treeSet.headSet(3);

		// subSet starts at the beginning of the set until the argument element
		treeSet.headSet(3, true);

		// subSet starts at the argument element to the end of the set
		treeSet.tailSet(2);

		// sub set starts at one element after the specified argument to the end of the
		// set
		treeSet.tailSet(2, false);
	}

	public static void main(String args[]) {
		treeSet();
	}
}
