/**
 * 
 */
package ortiz.perez.albin.observable;

/**
 * @author Administrador
 *
 */
public class Executor {

    /**
     * @param args
     */
    public static void main(String[] args) {
	BeingWatched bw = new BeingWatched();
	bw.addObserver(new Watcher());
	bw.doSomething();

    }

}
