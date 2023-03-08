package TowPointers;

// find the pair of elements who's sum is equal to k
// array is sorted
public class TowSum {

	static int twoSum(int arr[], int k) {
		int i = 0;
		int j = arr.length - 1;
		int count = 0;
		
		while(i < j) {
			if(arr[i] + arr[j] < k) {
				i++;
			}else if(arr[i] + arr[j] > k) {
				j--;
			}else {
				count++;
				j--;
			}
		}
		return count;
		
		
	}
	
	 public static void main(String args[]) {
		 int arr[] = {1,4,4,5,5,5,6,6,11};
		 System.out.print(twoSum(arr, 11));
	 }
}
