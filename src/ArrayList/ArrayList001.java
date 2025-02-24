package ArrayList;

import java.util.*;

public class ArrayList001 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,5,6,7};
		int arr2[]= {1,2,3,4,5,6,7};
		
		

		ArrayList<Integer> str1=new ArrayList<Integer>();
		for(int i:arr1) {
			str1.add(i);
		}
		System.out.println(str1);
		ArrayList<Integer> str2=new ArrayList<Integer>();
		for(int i:arr2) {
			str2.add(i);
		}
		
			
		str2.removeAll(str1);
		System.out.println("---------------------str1------------------");

		System.out.println(str1);
		System.out.println("---------------------str2------------------");
		System.out.println("Missing Element"+str2);
	}

}
