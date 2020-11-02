package javaSession3;

import java.util.*;

public class Activity3_2 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Xiao Zhan");
		hs.add("Wei Wuxian");
		hs.add("Wang Yibo");
		hs.add("Lan Wanji");
		hs.add("Wei Ying");
		hs.add("Lan Zhan");
		hs.add("Neelima");
		
		System.out.println("Size of the HashSet:: " + hs.size());
		hs.remove("Neelima");
		if(hs.remove("Ramkee"))
			System.out.println("Ramkee is removed.");
		else
			System.out.println("Ramkee is not removed.");
		
		System.out.println("Verify Ramkee: " + hs.contains("Ramkee"));
		
		System.out.println("All items of HashSet:");

		System.out.println(hs);

	}

}
