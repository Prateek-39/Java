package Day1;
import java.util.Scanner;
import java.lang.*;

public class NumberToWord {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number:");
		var s = new Scanner(System.in);
		String N = s.nextLine();
	    String st[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	    for(int i=0;i<N.length();++i) {
	    	String a = st[Character.getNumericValue(N.charAt(i))];
	    	System.out.print(a + " ");
	    }
		
	}
}
