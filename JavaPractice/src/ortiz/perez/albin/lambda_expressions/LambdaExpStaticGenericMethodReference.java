package ortiz.perez.albin.lambda_expressions;

public class LambdaExpStaticGenericMethodReference {

    static interface Test<T> {
	void doSomething(T t1, T t2);
    }

    public static <T> void doSomething(T t1, T t2) {
	System.out.println(t1.equals(t2));
    }

    public static void main(String ars[]) {
	Test<String> t = LambdaExpStaticGenericMethodReference::<String>doSomething;
	t.doSomething("", "");
    }

}
