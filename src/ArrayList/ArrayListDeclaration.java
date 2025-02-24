package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar=new ArrayList<Object>();
		
		System.out.println(ar);
		ar.add(100);
		ar.add(30);
		
		System.out.println(ar);
		
	System.out.println("-------------------------------");
	
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	System.out.println("--------------------------------");
	for(Object ob:ar) {
		System.out.println(ob);
	}
	
	System.out.println("---------------------------------------");
	ar.stream().forEach(ele ->System.out.print(ele) );
	System.out.println("---------------------------------------");

	Iterator <Object> it= ar.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	ArrayList<Integer> ar1=new ArrayList<Integer>();
	ar1.add(1);
	
	System.out.println(ar1);
	}
	
	}

}
