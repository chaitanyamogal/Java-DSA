package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindKthMaxMinElement {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int arr[] = { 1, 2, 3, 3, 6, 8, 4, 7};
		sort(arr);
		System.out.println(arr[num - 1]);
		
		
	}
	
    static void sort(int arr[]) {
    	int length = arr.length;
    	int temp;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 1; j < length; j++) {
    			if(arr[j] < arr[j - 1]) {
    				temp = arr[j];
    				arr[j] = arr[j-1];
    				arr[j-1] = temp;
    			}
    		}
    		length--;
     	}
    }
}
