package ortiz.perez.albin.lambda_expressions;

import java.util.Arrays;
import java.util.Comparator;

public class InstanceMethodReferenceOfAnArbitraryObject {

    public void test(Comparator<String> c, String t, String u) {
	c.compare(t, u);
    }

    public static void main(String[] args) {
	InstanceMethodReferenceOfAnArbitraryObject imr = new InstanceMethodReferenceOfAnArbitraryObject();
	
	imr.test(String::compareTo, "Albin", "Perez");

	String[] x = { "Albin", "Perez" };
	Arrays.sort(x, String::compareTo);
    }

}
