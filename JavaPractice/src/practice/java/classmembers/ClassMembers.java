/**
 * 
 */
package practice.java.classmembers;

/**
 * @author apobits@gmail.com
 *
 */
public class ClassMembers {

    public ClassMembers() {
	System.out.println(++a);
    }

    // class member
    static int a = 0;

    // constant class member
    static final int B = 1;

    // class method
    public static void method1() {
	System.out.println("A class method1 member");
    }

    // class method that can't be overridden
    public static final void method2() {

    }

    public static void main(String args[]) {
	ClassMembers c1 = new ClassMembers();
	ClassMembers c2 = new ClassMembers();
	ClassMembers c3 = new ClassMembers();
	ClassMembers c4 = new ClassMembers();
	ClassMembers c5 = new ClassMembers();

    }
}
