package javaSession3;

import java.util.*;

public class Activity3_3A {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(14);
		q.add(13);
		q.add(5);
		q.add(7);
		q.add(22);
		
		System.out.println(q);
		q.remove();
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q);
		
	}

}
