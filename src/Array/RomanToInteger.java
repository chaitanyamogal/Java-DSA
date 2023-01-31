// Letcode - https://leetcode.com/problems/roman-to-integer/
package Array;

public class RomanToInteger {
	public static void main(String args[]) {
		System.out.print(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int i = 0;
		int num = 0;

		while (i <= s.length() - 1) {
			int n1 = 0, n2 = 0;
			switch (s.charAt(i)) {
			case 'I':
				n1 = 1;
				break;
			case 'V':
				n1 = 5;
				break;
			case 'X':
				n1 = 10;
				break;
			case 'L':
				n1 = 50;
				break;
			case 'C':
				n1 = 100;
				break;
			case 'D':
				n1 = 500;
				break;
			case 'M':
				n1 = 1000;
				break;
			}
			if (i != s.length() - 1) {
				switch (s.charAt(i + 1)) {
				case 'I':
					n2 = 1;
					break;
				case 'V':
					n2 = 5;
					break;
				case 'X':
					n2 = 10;
					break;
				case 'L':
					n2 = 50;
					break;
				case 'C':
					n2 = 100;
					break;
				case 'D':
					n2 = 500;
					break;
				case 'M':
					n2 = 1000;
					break;
				}
			}
			if (n1 > n2) {
				num += n1;
				i++;
			} else if (n1 < n2) {
				num += (n2 - n1);
				i += 2;
			} else {
				num += n1;
				i++;
			}

		}
		return num;
	}
}
