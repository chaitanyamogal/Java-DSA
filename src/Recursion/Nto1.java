package Recursion;

public class Nto1 {
	
	static void recur(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.print(n);
		recur(n - 1);
	}
	
	public static void main(String args[]) {
		recur(5);
	}
}
