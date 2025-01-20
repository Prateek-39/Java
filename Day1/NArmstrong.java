import java.util.Scanner;

public class NArmstrong {
	
	static boolean isarm(int i) {
		int sum = 0;
		int rem = 0;
		int num1 = i;
		while(num1 >0) {
			rem = num1%10;
			sum = (int) (sum + Math.pow(rem, 3));
			num1 =num1/10;
		}
		
		if(sum == i) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i=1;i<=N;++i) {
			if(isarm(i)) {
				System.out.println(i);
			}
		}

	}

}
