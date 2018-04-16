/**
 * 
 */
package practice.java.object;

/**
 * @author apobits@gmail.com
 *
 */
public class A implements Cloneable {

    private int a = 0;

    /**
     * @return the a
     */
    public int getA() {
	return a;
    }

    /**
     * @param a
     *            the a to set
     */
    public void setA(int a) {
	this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
    }

}
