/**
 * 
 */
package practice.java.generic;

/**
 * @author Administrador
 *
 */
public class GenericRestriction<T> {

	private T t;

	private T[] tt;

	// static private T tt;//a type parameter cannot be static

//	public static T getT() {//cannot use a type parameter declared in the enclosing class in a static method
//		return null;
//	}

	public GenericRestriction(T t, T[] tt) {
		// this.t = new T();// cannot instantiate type parameter
		// tt = new T[10];//cannot create a generic array of T
		this.t = t;// valid
		this.tt = tt;// valid
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// GenericRestriction<Integer>[] obj = new
		// GenericRestriction<Integer>[10];//Cannot create a generic array of
		// GenericRestriction<Integer>

		GenericRestriction<?>[] array = new GenericRestriction<?>[10];// valid
		array[0] = new GenericRestriction<Integer>(3, new Integer[] { 1, 2, 3 });

	}

}
