package ortiz.perez.albin.lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpCollectionExample {

	static int compare(Integer x, Integer y) {
		return x - y;
	}

	public static void main(String args[]) {

		ArrayList<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(3);
		collection.add(2);
		collection.forEach(t -> System.out.print(t));
		System.out.println(Collections.max(collection, LambdaExpCollectionExample::compare));

	}

}
