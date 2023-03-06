package findPivotIndex;

//By AgusLacomi
//Unfinished

class Solution {
	public int pivotIndex(int[] nums) {

		int pivot = -1;

		int left = 0;
		int rigth = 0;

		for (int i = 0; i < nums.length; i++) {

			left += nums[i];
			
			for (int j = 1; j < nums.length; j++) {

				rigth += nums[nums.length - j];
			}
			
			if (left == rigth) {
				
				return
				
			}

		}

		return pivot;
	}
}
