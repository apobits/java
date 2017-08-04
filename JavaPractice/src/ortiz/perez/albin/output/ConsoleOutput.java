/**
 * 
 */
package ortiz.perez.albin.output;

import java.io.PrintWriter;

/**
 * @author aposo
 *
 */
public class ConsoleOutput {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int c = 'N';
	
	System.out.write(c);
	System.out.write('\n');
	
	PrintWriter printWriter = new PrintWriter(System.out, true);
	printWriter.println("Hola");
	printWriter.println(7);

    }

}
