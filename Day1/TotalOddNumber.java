import java.util.*;

public class TotalOddNumber {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int num = 0;
    	for(int i=0;i<N;++i) {
    		if(i%2 != 0) {
    			++num;
    		}
    	}
    	System.out.println(num);
    }
}