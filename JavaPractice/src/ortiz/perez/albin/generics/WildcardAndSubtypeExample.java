package ortiz.perez.albin.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardAndSubtypeExample {

    public static void main(String[] args) {
	// okay
	List<? extends Integer> n = new ArrayList<>();
	List<? extends Number> nn = n;

	// error
//	List<Integer> m = new ArrayList<>();
//	List<Number> mm = m;

    }

}
