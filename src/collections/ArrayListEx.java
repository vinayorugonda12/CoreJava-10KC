package collections;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		
		System.out.println(fruits);
		System.out.println();
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		
		System.out.println();
		
		//for each
		
		for(String i:fruits) {
			System.out.println(i.toUpperCase().charAt(2));
		}
		
		
	}

}
