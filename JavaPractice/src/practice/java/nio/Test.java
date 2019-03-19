/**
 * 
 */
package practice.java.nio;

import java.util.List;

/**
 * @author apobits@gmail.com
 *
 */
public interface Test {
	default void process(List<String> names) {
		System.out.println(names);
	}

	void process1(List<String> names);
}