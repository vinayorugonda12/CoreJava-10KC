package collections;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		System.out.println(a.get(4));
		System.out.println(a.remove(a.get(1)));
		System.out.println(a);
		
		System.out.println(a.size());
	}
}
