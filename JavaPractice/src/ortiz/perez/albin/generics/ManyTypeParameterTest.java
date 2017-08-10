/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class ManyTypeParameterTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ManyTypeParameter<String, Integer> b = new ManyTypeParameter<String, Integer>("albin", 10);

	ManyTypeParameter3<String, Integer, String> c = new ManyTypeParameter3<String, Integer, String>("", 1, "");
	
    }

}
