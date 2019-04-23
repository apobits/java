/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aposo
 *
 */
public class ParallelMapReduce {

	static class Product {
		private double price;

		public Product(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		List<Product> prd = new ArrayList<>();
		prd.add(new Product(100));
		prd.add(new Product(200));
		prd.add(new Product(300));
		double totalPrice = prd.stream().parallel().map(p -> p.getPrice()).reduce(0.0, (p1, p2) -> p1 + p2);
		System.out.println(totalPrice);

	}

}
