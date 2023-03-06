package searchInsert;

public class Solution2 {

	// By AgusLacomi
	// Using binary search

	public int searchInsert(int[] nums, int target) {

		int start = 0, end = nums.length - 1;

		while (start <= end) {

			int position = start + (end - start) / 2;

			if (nums[position] > target) {

				end = position - 1;

			} else if (nums[position] < target) {

				start = position + 1;

			} else {

				return position;

			}
		}

		return start;
	}

}
