/**
 * 
 */
package ortiz.perez.albin.object;

/**
 * @author Administrador
 *
 */
public class CloneExample implements Cloneable {

	String name;

	Test test;
	int i = 0;

	public CloneExample(Test test) {
		this.test = test;
	}

	public CloneExample cloneObject() throws CloneNotSupportedException {
		return (CloneExample) super.clone();
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneExample c1 = new CloneExample(new Test(new String("Albin")));
		CloneExample c2;

		c1.name = "Albin";
		c2 = (CloneExample) c1.cloneObject();
		c2.test.name = "Danna";
		c2.i = 1;
		c2.name = "Danna";
		System.out.println("c1 equals c2 " + c1.equals(c2));
		System.out.println("c1.name " + c1.name);
		System.out.println("c2.name " + c2.name);
		System.out.println("c1.test.name " + c1.test.name);
		System.out.println("c2.test.name " + c2.test.name);
		System.out.println("c1.i " + c1.i);
		System.out.println("c2.i " + c2.i);

	}

	static class Test {
		String name;

		public Test(String name) {
			this.name = name;
		}
	}
}
