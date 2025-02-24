package StringLogic;

public class ExtractIntegerValueFromString {

		public static void extractIntegerValue(String str)  {
			
			String[] s=str.split("[^0-9]+");
			int sum=0;
			
				for(String i:s) {
					System.out.print(i+",");
				int converted=Integer.parseInt(i);
				 sum=sum+converted;
				
				}
			 System.out.println("Total="+sum+".");
			
		}
	
	
	public static void main(String[] args) {
	        String s = "1et12t425  hghg55 hgy7";
	       System.out.println(s);
	        
	        extractIntegerValue(s);
	    }
		
	}


