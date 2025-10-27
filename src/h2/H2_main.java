package h2;

public class H2_main {
	public static void main(String[] args) {
		int i=4;
		int j=7;
		int k=9;
		int max=i;
		int min=i;
		
		
			if (i>j&&i>k){
				 max=i;
			}
			
			if (j>k&&j>i){
				 max=j;
			}
			
			if (k>i&&k>j){
				max=k;
			}
			
			if (i<j&&i<k){
				 min=i;
			}
			
			if (j<k&&j<i){
				 min=j;
			}
			
			if (k<i&&k<j){
				min=k;
			}
			System.out.print("Maximum:");
			System.out.println(max);
		
			System.out.print("Minimum:");
			System.out.println(min);
			
			
		
	}
	
}
