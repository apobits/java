/**
 * 
 */
package ortiz.perez.albin.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Administrador
 *
 */
public class Watcher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
	System.out.println((String) arg);

    }

}
