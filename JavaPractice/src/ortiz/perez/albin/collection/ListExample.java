/**
 * 
 */
package ortiz.perez.albin.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrador
 *
 */
public class ListExample {

	static class A {
		String name;

		public A(String name) {
			this.name = name;
		}
		
		public String toString(){
			return name;
		}
	}

	public static void main(String[] args) {

		//array list with integer objects 
		List<Integer> integers = new ArrayList<>();
		List<Integer> integers1 = new ArrayList<>();
		Integer x = new Integer(4);
		integers1.add(new Integer(2));
		integers1.add(new Integer(3));
		integers.add(new Integer(0));
		integers.add(x);
		x = 5;
		integers.add(0, new Integer(1));
		integers.addAll(0, integers1);
		System.out.println(integers);
		System.out.println(x);
		
		//linked list with integer objects
		List<Integer> linkedIntegers = new LinkedList<>();
		linkedIntegers.add(x);
		x=6;
		System.out.println(linkedIntegers);
		System.out.println(x);
		
		//array list with A class objects 
		List<A> a = new ArrayList<>();
		A ab = new A("Albin");
		a.add(ab);
		ab.name="Perez";
		System.out.println(a);
		
		List<A> b = new LinkedList<>();
		b.add(ab);
		ab.name="Albin";
		System.out.println(b);
		
	}

}
