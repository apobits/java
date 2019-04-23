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
public class Q22 {

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
		List<Product> prod = new ArrayList<>();
		prod.add(new Product(100));
		prod.add(new Product(200));
		prod.add(new Product(300));

		double totalPrice = prod.stream().parallel().map(t -> t.getPrice()).reduce(0.0, (t, u) -> t + u);
		System.out.println(totalPrice);
	}

}
