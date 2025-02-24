package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLogic2 {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ar1.removeIf(num -> num%2 != 0);
		System.out.println(ar1);
		
		System.out.println("---------------------------------------------------");
		
		
	}
}
