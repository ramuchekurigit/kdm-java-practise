package org.Iteration.com;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		   ArrayList<String> arrayList = new ArrayList<>();

	        
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Mango");

	       
	        System.out.println("Elements in the ArrayList:");
	        for (String element : arrayList) {
	            System.out.println(element);
	        }

	}

}
