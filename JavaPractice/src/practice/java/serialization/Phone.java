/**
 * 
 */
package practice.java.serialization;

import java.io.Serializable;

/**
 * @author apobits@gmail.com
 *
 */
public class Phone implements Serializable {

    private int number;

    private int indicative;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIndicative() {
        return indicative;
    }

    public void setIndicative(int indicative) {
        this.indicative = indicative;
    }


}
