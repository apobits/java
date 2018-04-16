/**
 * 
 */
package ortiz.perez.albin.resourcebundle;

import java.util.ListResourceBundle;

/**
 * @author Administrador
 *
 */
public class Message_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
	Object[][] messages = new Object[1][2];
	messages[0][0] = "architect";
	messages[0][1] = "Architect";

	return messages;
    }

}
