import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int start = 0;
		int end = s.length()-1;
		int ans= 0;
		
		while(start<end) {
			if(s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
				ans = 1;
			}else {
				ans = 0;
				break;
			}
		}
		
		if(ans == 1) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}
