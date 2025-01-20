package Day1;
import java.util.*;
import java.util.regex.Pattern;

public class Validator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = sc.nextLine();
		if(Pattern.matches("[a-zA-Z ]+",name)) {
			System.out.println("Your name is :" + name);
		}else {
			System.out.println("Invalid name");
		}
	
		System.out.println("What is your email");
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		String email = sc.nextLine();
        
        if (email.matches(emailRegex)) {
            System.out.println("Valid Email :"+ email);
        } else {
            System.out.println("Invalid Email");
        }
        
        
        System.out.println("What is your dob (YYYY-MM-DD)");
        String date = sc.nextLine();
        String dateRegex = "^\\d{4}-\\d{2}-\\d{2}$";
        
        if (date.matches(dateRegex)) {
            System.out.println("Valid Date "+ date);
        } else {
            System.out.println("Invalid Date");
        }
	}

}
