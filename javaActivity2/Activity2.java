package javaActivity2;

import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,77,10,54,-11,10};
		
		int Sum = 30;
		
		System.out.println("Given Array: " + Arrays.toString(array));
		System.out.println("Result: " + compareNum(array,Sum));
	}
	
	public static boolean compareNum(int[] arrayNum,int sum) {
		
		int add = 0;
		
		for(int i:arrayNum) {
			if(i==10) {
				add = add + i;
			}
		}
		
		return add == sum;
		
	}

}
