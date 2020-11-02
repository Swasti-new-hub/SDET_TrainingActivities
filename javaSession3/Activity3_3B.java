package javaSession3;


import java.util.*;

public class Activity3_3B {

	public static void main(String[] args) {

		Deque<String> dq = new LinkedList<String>();
		dq.add("Lion");
		dq.addFirst("Tiger");
		dq.addLast("Dog");
		dq.offer("Cat");
		dq.offerFirst("Leopard");
		dq.offerLast("Kangaroo");
		
		Iterator<String> itr = dq.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.contains("Dog"));
		dq.removeFirst();
		dq.pollLast();
		System.out.println(dq.size());
		System.out.println(dq);
		

	}

}
