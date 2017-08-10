/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class SingleTypeParameterTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SingleTypeParameter<?> a = new SingleTypeParameter<String>("Albin");
	SingleTypeParameter<?> b = new SingleTypeParameter<Integer>(100);
	SingleTypeParameter<?> c = new SingleTypeParameter<Boolean>(true);
	SingleTypeParameter<?> d = new SingleTypeParameter<Double>(10.1);
	SingleTypeParameter<?> e = new SingleTypeParameter<Float>(1.0f);

    }

}
