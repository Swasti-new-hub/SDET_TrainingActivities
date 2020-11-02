package javaActivity3;

import java.util.*;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sortArray = {4,8,3,7,5,2,1,6,10,9};
		System.out.println("Original Array: " + Arrays.toString(sortArray));
		sort(sortArray);
		System.out.println("Sorted Array: " + Arrays.toString(sortArray));
		
	}
	
	public static void sort(int[] array) {
		int len = array.length;
		int i;
		
		for(i=1; i<len; i++) {
			int num = array[i];
			int j=i-1;
			while(j>=0 && num<array[j]) {
				array[j+1]=array[j];
				--j;
			}
			array[j+1]=num;
			
		}
	}

}
