package ortiz.perez.albin.lambda_expressions;

import java.util.function.Consumer;

public class StaticMethodReference {

    public static <T> void consume(Consumer<T> c, T t) {
	c.accept(t);
    }

    public static <T> void consumerImp(T t) {
	System.out.println(t);
    }

    public static void main(String[] args) {
	consume(StaticMethodReference::consumerImp, "Albin");

    }

}
