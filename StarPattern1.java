package StarPattern;
/*	*
 * 	**
 * 	***
 * 	****
 * 	*****
 *   
 * 
 */

public class StarPattern1 {
	
	static void patten1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patten1(5);
	}

}
