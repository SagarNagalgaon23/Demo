package TreeMap;

import java.util.*;

public class Treemap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map1=new TreeMap<>();
		map1.put(10000,"Tom");
		map1.put(9858, "Lisa");
		map1.put(9390,"Larry");
		map1.put(7884,"Jhon");
		map1.put(6787,"ted");
		System.out.println(map1);
		System.out.println(map1.firstKey());
		System.out.println(map1.lastKey());
		System.out.println("------------------------");
		System.out.println(map1.headMap(7000));
		System.out.println("------------------------");
		System.out.println(map1.tailMap(7000));
		System.out.println("------------------------");

		
	}

}
