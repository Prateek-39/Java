package Day1;
import java.util.*;
import java.lang.*;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int sum = 0;
		int rem = 0;
		int num1 = num;
		while(num1 >0) {
			rem = num1%10;
			sum = (int) (sum + Math.pow(rem, 3));
			num1 =num1/10;
		}
		
		if(sum == num) {
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is not Armstrong");
		}

	}

}
