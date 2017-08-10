/**
 * 
 */
package ortiz.perez.albin.generics;

/**
 * @author aposo
 *
 */
public class GenC<T extends B & Comparable<String>> {// bounded type parameter with extends Class type and interface type

    public GenC(T t) {

    }

}
