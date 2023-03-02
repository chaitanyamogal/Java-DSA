package Recursion;

public class SumOfDigits {
	
	public static void main(String argv[]) {
		 System.out.print(addDigits(125));
	}
	
	static int addDigits(int n) {
		if((n % 10) == 0 && (n/10) == 0) {
			return 0;
		}
		
		return (n % 10) + addDigits(n/10);
	}
	
}
