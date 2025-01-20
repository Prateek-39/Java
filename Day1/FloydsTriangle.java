package Day1;

import java.util.*;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows n :");
		int n = s.nextInt();
		int k =1;
		for(int i=1; i<=n; ++i) {
			for(int j=0;j<i;++j) {
				System.out.print(k + " ");
				++k;
			}
			System.out.println();
		}
	}

}
