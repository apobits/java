/**
 * 
 */
package practice.java.io;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author apobits@gmail.com
 *
 */
public class BufferedWriterExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try (OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter br = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(br)) {

	    pw.write("PrintWriter ");
	    br.write("BufferedWriter ");
	    osw.write("OutputStreamWriter ");
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
