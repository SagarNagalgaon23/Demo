package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListLogic3 {

	public static void main(String[] args) {
		
		String str="Sagar";
	//	String [] ar=str.split("");
		char arr[]=str.toCharArray();
		
		ArrayList<Character> ars=new ArrayList<Character>();
		for(char s:arr) {
			ars.add(s);
		}
		
		System.out.println(ars);
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>( ars);
		
		System.out.println(lhs);
	}

}
