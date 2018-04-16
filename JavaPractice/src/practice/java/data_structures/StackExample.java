/**
 * 
 */
package practice.java.data_structures;

import java.util.Stack;

/**
 * @author apobits@gmail.com
 *
 */
public class StackExample {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Stack<String> stack1 = new Stack<>();
	Stack<String> stack2 = new Stack<>();

	stack1.push("Albin");
	stack1.push("Perez");
	stack2.push(stack1.pop());
	stack2.push(stack1.pop());
	System.out.println(stack2.pop());
	System.out.println(stack2.pop());

    }

}
