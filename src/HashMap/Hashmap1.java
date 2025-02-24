package HashMap;

import java.util.HashMap;

public class Hashmap1 {
public static void countVowles(String str) {
	//String[] st1=str.split("[^'a','e','i','o','u']+");
	char[] ch=str.toCharArray();
	
	System.out.println(ch);
	HashMap<Character,Integer> mapCount=new HashMap<Character,Integer>();
	
	for(char c:ch) {
		if(mapCount.containsKey(c)) {
			mapCount.put(c, mapCount.get(c)+1);
		}
		else {
			mapCount.put(c, 1);
		}
//		System.out.println(c);

	}
	System.out.println(mapCount);

}
	
	public static void main(String[] args) {
	
		countVowles("sagarNagalgaonAutomationTesting");
	}

}
