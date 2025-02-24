package HashMap;

import java.util.HashMap;

public class String11 {
	
	public static void StringCharArray(String str) {
		
		char ch1[]=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char ss:ch1) {
			System.out.print(ss+",");
			if(ss=='a'||ss=='e'||ss=='i'||ss=='o'||ss=='u') {
				if(map.containsKey(ss)) {
					map.put(ss, map.get(ss)+1);
				}
				else
				{
					map.put(ss, 1);
				}
			}
		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		String str="Sagar Nagalgaon Automation";
		String str1=str.toLowerCase();
		StringCharArray(str1);
	}

}
