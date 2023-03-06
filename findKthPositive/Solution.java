package findKthPositive;

import java.util.Arrays;

// By AgusLacomi
// https://leetcode.com/problems/kth-missing-positive-number/

class Solution {

	/**
	 * Input: arr = [2,3,4,7,11], k = 5 Output: 9 Explanation: The missing positive
	 * integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
	 * 
	 * 
	 * @param arr
	 * @param k
	 * @return missings [k-1]
	 */
	public int findKthPositive(int[] arr, int k) {

		/**
		 * Create an array of size equal to the last value of @param arr, in order to
		 * make the compare.
		 */
		int[] arrToCompare = new int[arr[arr.length - 1]];

		for (int i = 0; i < arrToCompare.length; i++) {
			i++;
			arrToCompare[i - 1] = i;
			i--;
		}

		int[] missings = new int[1000];
		int aux2 = 0;

		for (int i = 0; i < arrToCompare.length; i++) {

			int aux = Arrays.binarySearch(arr, arrToCompare[i]);

			if (aux < 0) {

				missings[aux2] = arrToCompare[i];
				aux2++;
			}
		}

		missings[aux2++] = arrToCompare.length + 1;

		for (int i = aux2; i < missings.length; i++) {

			missings[i] = missings[i - 1] + 1;

		}

		return missings[k - 1];

	}

	public static void main(String[] args) {

		Solution a = new Solution();

		int[] arr = { 2, 3, 4, 7, 11 };

		System.out.println(a.findKthPositive(arr, 13));

	}

}