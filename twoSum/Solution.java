package twoSum;

class Solution {

	public static void main(String[] args) {

		Solution first = new Solution();

		int[] array = { 3, 2, 4, };

		first.twoSum(array, 6);
	}

	public int[] twoSum(int[] nums, int target) {

		int[] outPout = new int[2];

		int i = 0, j = 0;

		for (; i < nums.length - 1; i++) {

			j++;

			for (; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {

					outPout[0] = i;
					outPout[1] = j;

					j = nums.length;
					i = nums.length;
				}
			}

			j = i + 1;
		}

		return outPout;

	}
}