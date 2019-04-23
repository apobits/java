/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q14 {

	static class Vehicle {
		int vId;
		String vName;

		public Vehicle(int vIdArg, String vNameArg) {
			this.vId = vIdArg;
			this.vName = vNameArg;
		}

		public int getvId() {
			return vId;
		}

		public String getvName() {
			return vName;
		}

		@Override
		public String toString() {
			return vName;
		}
	}

	public static void main(String[] args) {

		List<Vehicle> vehicle = Arrays.asList(new Vehicle(2, "Car"), new Vehicle(3, "Bike"), new Vehicle(1, "Truck"));

		vehicle.stream().sorted((t, u) -> Integer.compare(t.getvId(), u.getvId())).forEach(t -> System.out.print(t));

		System.out.println();
		vehicle.stream().sorted(Comparator.comparing((Vehicle t) -> t.getvId())).forEach(t -> System.out.print(t));

	}

}
