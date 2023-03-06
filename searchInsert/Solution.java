package searchInsert;

public class Solution {

	// By AgusLacomi
	// Using secuencial search

	public int searchInsert(int[] nums, int target) {

		int i = nums.length;

		while (i >= 0) {

			i--;

			if (nums[0] > target) {

				return 0;

			} else if (nums[i] < target) {

				i++;

				return (i);

			} else if (nums[i] == target) {

				return i;

			}

		}

		return i;

	}
}
