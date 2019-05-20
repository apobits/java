/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class InitializationBlocksExamples {

	static int e;

	int i;
	// initialization block, rarely used, it is better to use constructors for that
	// purpose
	// third to be called when running the program
	{

		i = 1;

	}

	// static initialization block
	// first to be called when running the program
	static {
		e = 2;
	}

	// second to be called when running the program
	public InitializationBlocksExamples() {
		System.out.println("lol");

	}

	public static void main(String[] args) {
		System.out.println(new InitializationBlocksExamples().i);
		System.out.println(InitializationBlocksExamples.e);
	}

}
