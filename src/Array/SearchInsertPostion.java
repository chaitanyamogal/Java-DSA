// https://leetcode.com/problems/search-insert-position/
package Array;

public class SearchInsertPostion {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 6 };
		System.out.print(searchInsert(arr, 7));
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (target < nums[mid]) {
				end = mid - 1;

			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;
	}
}
