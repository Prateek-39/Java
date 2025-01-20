import java.util.Scanner;

public class NPalindrome {
	
	static boolean ispal(int i) {
		int n = 0;
		int num1 = i;
		while(num1 >0) {
			n = n*10 + num1%10;
			num1 =num1/10;
		}
		
		if(n == i) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;++i) {
			if(ispal(i)) {
				System.out.println(i);
			}
		}

	}

}
