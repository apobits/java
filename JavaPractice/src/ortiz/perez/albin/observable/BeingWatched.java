/**
 * 
 */
package ortiz.perez.albin.observable;

/**
 * @author Administrador
 *
 */
import java.util.Observable;

public class BeingWatched extends Observable {

    public void doSomething() {
	setChanged();
	notifyObservers(new String("Albin"));
    }

}
