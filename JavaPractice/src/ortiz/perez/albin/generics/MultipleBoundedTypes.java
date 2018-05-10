/**
 * 
 */
package ortiz.perez.albin.generics;

interface X {
}

interface Y {
}

class Z extends Number implements X, Y {

    @Override
    public int intValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public long longValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public float floatValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public double doubleValue() {
	// TODO Auto-generated method stub
	return 0;
    }
}

/**
 * @author apobits@gmail.com
 *
 */
// public class MultipleBoundedTypes<T extends A & B> {multiple bounded
// type parameters can contain only one class and many interfaces the example
// commented generates a compile time error
public class MultipleBoundedTypes<T extends Number & X & Y> {

    public void doSomething(T t) {
	System.out.println(t.intValue());// you can use methods defined in the bounds
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	MultipleBoundedTypes<Z> m = new MultipleBoundedTypes<>();
	m.doSomething(new Z());
    }

}
