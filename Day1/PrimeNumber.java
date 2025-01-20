package Day1;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isprime(int i) {
		if(i<2) {
			return false;
		}
		if(i == 2) {
			return true;
		}else {
			for(int j=2;j<i;++j) {
				if(i%j == 0) {
					return false;
				}
			}
			return true;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i=1;i<=N;++i) {
			if(isprime(i)) {
				++count;
				sum = sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of N PrimeNumber is:"+ sum);
		System.out.println("Total Number of PrimeNumber is:"+ count);
		System.out.println("Average:" + (sum/count));
		

	}

}
