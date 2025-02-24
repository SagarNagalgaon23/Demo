package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLogic1 {

	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>(Arrays.asList("Sagar","Naveen","Automation"));
		
		ar.add("aa");
		ar.add("bb");
		System.out.println(ar);
		System.out.println("---------------------------");
		for(String str:ar) {
			if(str.contains("aa")) {
				ar.remove("bb");
			}
			
			System.out.println(str);
		}
		
		System.out.println("---------------------------");
		
		System.out.println(ar);
		
		
	}

}
