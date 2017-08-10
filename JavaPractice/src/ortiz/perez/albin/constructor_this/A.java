/**
 * 
 */
package ortiz.perez.albin.constructor_this;

/**
 * @author aposo
 *
 */
public class A {

    private String name;

    private String lastName;

    public A(String name, String lastName) {
	this.name = name;
	this.lastName = lastName;
    }

    public A() {
	this("", "");
    }

}
