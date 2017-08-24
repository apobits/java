/**
 * 
 */
package ortiz.perez.albin.xml;

import java.beans.XMLEncoder;

/**
 * @author aposo
 *
 */
public class EncoderExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	XMLEncoder encoder = new XMLEncoder(System.out);
	encoder.writeObject(new Person("Albin", "Perez"));
	encoder.close();
    }

}
