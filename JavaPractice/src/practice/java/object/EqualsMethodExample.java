package practice.java.object;

public class EqualsMethodExample {

    // equals method compare two objects memory addresses to evaluate equality
    // if this method is overridden the hashCode method should be overridden too to
    // maintain the contract that equals objects must have equals hash codes
    @Override
    public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
    }

    public static void main(String args[]) {
	EqualsMethodExample obj1 = new EqualsMethodExample();
	EqualsMethodExample obj2 = new EqualsMethodExample();
	EqualsMethodExample obj3 = obj1;

	System.out.println("obj1 equals obj2 " + obj1.equals(obj2));
	System.out.println("obj1 equals obj3 " + obj1.equals(obj3));

    }

}
