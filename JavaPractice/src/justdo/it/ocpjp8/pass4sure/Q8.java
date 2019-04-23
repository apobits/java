/**
 * 
 */
package justdo.it.ocpjp8.pass4sure;

import java.util.Arrays;
import java.util.List;

/**
 * @author aposo
 *
 */
public class Q8 {
	List<String> list = null;

	public void printValues() {
		System.out.println(getList());
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog","Cat","Mouse");
		Q8 q8 = new Q8();
		q8.setList(li);
//		q8.getList().forEach(Q8::printValues);

	}

}
