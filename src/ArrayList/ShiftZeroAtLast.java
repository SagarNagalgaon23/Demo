package ArrayList;

import java.util.ArrayList;

public class ShiftZeroAtLast {
	
	public static void shiftZeroLast(int arr[]) {
		ArrayList<Integer> ar11=new ArrayList<Integer>();
		for(int ar:arr) {
			ar11.add(ar);
		}
		System.out.println("ArrayList"+ar11);
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int ar:arr) {
			if(ar<=0) {
				arr1.add(ar);
			}
		}
		System.out.println("ArrayList1:"+arr1);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int ar1:arr) {
			if(ar1>0) {
				arr2.add(ar1);
			}
		}
		System.out.println("ArrayList2:"+arr2);
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.addAll(arr2);
		arr3.addAll(arr1);
		System.out.println("ArrayList3:"+arr3);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,0,4,5,0,6,0,5,7,8,0};
		shiftZeroLast(arr);
	}

}
