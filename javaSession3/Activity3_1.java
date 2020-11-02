package javaSession3;

import java.util.*;

public class Activity3_1 {
	public static void main(String[] str) {
	
	ArrayList<String> myList = new ArrayList<String>();
	
	myList.add("Xiao Zhan");
	myList.add("Wei Wuxian");
	myList.add("Wang Yibo");
	myList.add("Lan Wanji");
	myList.add("Wei Ying");
	myList.add("Lan Zhan");
	myList.add("Neelima");
	
	for(String s:myList) {
		System.out.println("Array Name: " + s);
	}
	
	System.out.println("Third Name in the Array: " + myList.get(2));
	System.out.println("verify Neelima: " + myList.contains("Neelima"));
	System.out.println("Size of the array: " + myList.size());
	myList.remove(6);
	System.out.println("Size of the array after removal: " + myList.size());
	
	}

}
