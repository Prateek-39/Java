package Day1;
import java.util.Scanner;

public class Patterns {

	static void triangle(int N) {
		for(int i=1;i<=N;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	static void pyramid(int N) {
		  for (int i = 1; i <= N; i++) {
	           
	            for (int j = i; j < N; j++) {
	                System.out.print(" ");  // Print spaces
	            }

	          
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");  // Print stars in the pyramid pattern
	            }

	            
	            System.out.println();
	        }
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		triangle(N);
		pyramid(N);
		
	}

}
