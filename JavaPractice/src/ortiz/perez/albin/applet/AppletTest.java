/**
 * 
 */
package ortiz.perez.albin.applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author aposo
 *
 */

/*
 * <applet code="SimpleApplet" width=200 height=60> </applet>
 */

public class AppletTest extends Applet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
	g.drawString("Hi Albin", 50, 50);
    }

}
