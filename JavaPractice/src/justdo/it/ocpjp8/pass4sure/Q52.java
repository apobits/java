/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author aposo
 *
 */
public class Q52 {

	static class CustomerResource implements Closeable {

		private String resourceName;

		public CustomerResource(String resourceName) {
			this.setResourceName(resourceName);
		}

		@Override
		public void close() throws IOException {
			// TODO Auto-generated method stub

		}

		public String getResourceName() {
			return resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

	}

	public static void main(String[] args) {
		try (CustomerResource c = new CustomerResource("")) {

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
