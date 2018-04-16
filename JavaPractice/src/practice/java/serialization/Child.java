/**
 * 
 */
package practice.java.serialization;

/**
 * @author apobits@gmail.com
 *
 */
public class Child extends Person {

    private boolean isCrawling;

    private boolean isWalking;

    public boolean isCrawling() {
        return isCrawling;
    }

    public void setCrawling(boolean isCrawling) {
        this.isCrawling = isCrawling;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean isWalking) {
        this.isWalking = isWalking;
    }

}
