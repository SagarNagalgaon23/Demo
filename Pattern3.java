package StarPattern;

public class Pattern3 {
	
		public static void patteren4(char ch,int n) {
			int i,j;
			for( i=1;i<=n;i++) {
			
				for(j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				
				for(j=1;j<=i;j++) {
					System.out.print(ch+" ");
				}
				ch++;
				System.out.println();

			}
		}
	
	
	public static void main(String[] args) {
		char ch='A';
		patteren4(ch,5);
		
	}

}
