import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 */

/**
 * @author Administrador
 *
 */
public class MemoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss:sss");
		System.out.println(sdf.format(new Date()));
		ArrayList<Integer> list = new ArrayList<>(100750000);
		for(int i=0;i<100750000;i++){
			list.add(i);
		}
		System.out.println(list.size());
		System.out.println(sdf.format(new Date()));
	}

}
