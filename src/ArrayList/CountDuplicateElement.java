package ArrayList;

import java.util.HashMap;

public class CountDuplicateElement {

		public static void countDuplicate(String str) {
			
			if(str==null) {
				System.out.println("String is null");
				return;
			}
			else if(str=="") {
				System.out.println("String is empty");
				return;
			}
			else if(str.length()<=1) {
				System.out.println("String is Single character :"+str);
				return;
				
			}
			else {
				
				char chr[]=str.toCharArray();
				
				HashMap<Character,Integer> map=new HashMap<Character,Integer>();
				
				for(char ch:chr) {
					if(map.containsKey(ch)) {
						map.put(ch, map.get(ch)+1);
					}
					else {
						map.put(ch, 1);
					}
				}
				
				map.forEach((k,v)->System.out.println(k+":"+v));
				
			}
								
			
		}
	
	
	public static void main(String[] args) {
		String str="Sagar";
		int len=str.length();
		System.out.println(len);
		countDuplicate(null);
		countDuplicate(str);
		countDuplicate("A");
		

	}

}
