public class SumofDigit {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		int num = 555555224;
		int sum=0;
		while(num != 0) {
			sum = sum + num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
