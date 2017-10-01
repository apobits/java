package ortiz.perez.albin.collection.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String args[]) {
		ArrayDeque<Integer> numbers = new ArrayDeque<>();
		numbers.push(1);
		numbers.push(2);
		numbers.push(3);
		numbers.push(4);
		numbers.push(5);

		System.out.println(numbers);

		while (numbers.peek() != null)
			System.out.print(numbers.pop());
	}
}
