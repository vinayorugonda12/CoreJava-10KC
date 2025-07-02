package com.generalization;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Comparator;

//class Student{
//	String name;
//	int id;
//	public Student(String name, int id) {
////		super();
//		this.name = name;
//		this.id = id;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", id=" + id + "]";
//	}
//	
//	
//	
//}

//comparator.comparing(t ->t.parameter);

public class Test {
	
	
	static boolean isPrime(int a) {
		if(a<2) {
			return false;
		}
		if(a==2) {
			return true;
		}
		
		boolean result=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				result=false;
			}
		}
		return result;
		
//		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16,17,18,19));
		ArrayList<Integer> prime=new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if(isPrime(list.get(i))) {
				prime.add(list.get(i));
			}
			
		}
		
		System.out.println(prime);
		
		int[] arr=new int[prime.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=prime.get(i);
			
		}
		 
		System.out.println(Arrays.toString(arr));
		
		
		
		
//		list.add(new Student("ravi",10));
//		list.add(new Student("rani",12));
//		list.add(new Student("rahul",11));
//		
//		System.out.println(list);
//		list.sort(Comparator.comparing(t ->t.id));
//		System.out.println(list);
//		for(Student student:list) {
//			System.out.println(student);
//		}

	}

}
