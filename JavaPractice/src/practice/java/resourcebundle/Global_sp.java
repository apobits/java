/**
 * 
 */
package practice.java.resourcebundle;

import java.util.ListResourceBundle;

/**
 * @author apobits@gmail.com
 *
 */
public class Global_sp extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {

		Object[][] global = new Object[1][2];
		global[0][0] = "architect";
		global[0][1] = "Arquitecto";
		return global;
	}

}
