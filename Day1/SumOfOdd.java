public class SumOfOdd {

	public static void main(String[] args) {
		int N = 100;
		int sum = 0;
	       for(int i=0;i<N;++i) {
	           if(i%2 != 0) {
	        	   sum= sum + i;
	           }
	       }
	       System.out.println(sum);

	}

}
