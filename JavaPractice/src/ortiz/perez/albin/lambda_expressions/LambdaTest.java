package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

public class LambdaTest {

	private String name = "Albin";
	
	public boolean compareL(FunctionalIF<String> str){
		return true;
	}
	
	public boolean compareM(String str){
		return true;
	}

	public void doSomething() {
		int n = 0;
		Consumer<String> c = t -> {
			name = "Perez";
			// n++;//Local variable n defined in an enclosing scope must be
			// final or effectively final
			System.out.println(name);
		};

		c.accept(name);

		System.out.println(name);
	}

	public static void main(String[] args) {

		
		
	}

}
