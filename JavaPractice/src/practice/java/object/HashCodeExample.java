/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
public class HashCodeExample {

    // hashCode returns the objects memory address in hexadecimal
    // this method must work in accordance with equals method
    // if two objects are equal according to the equals method the hashCode method
    // must return the same integer value
    // it is not required that if two objects are not equal according to the equals
    // method that the hashCode method returns different integer
    @Override
    public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
    }

    public static void main(String[] args) {

	HashCodeExample ob1 = new HashCodeExample();
	HashCodeExample ob2 = new HashCodeExample();
	HashCodeExample ob3 = ob1;

	System.out.println("ob1 hash code " + ob1.hashCode() + " ob2 has code " + ob2.hashCode());
	System.out.println("ob1 hash code " + ob1.hashCode() + " ob3 has code " + ob3.hashCode());
    }

}
