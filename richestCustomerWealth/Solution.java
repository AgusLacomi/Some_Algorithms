package richestCustomerWealth;

class Solution {

	public static void main(String[] args) {

		Solution first = new Solution();

		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

		System.out.println(first.maximumWealth(accounts));

	}

	public int maximumWealth(int[][] accounts) {

		int[] customers = new int[accounts.length];

		int wealth = 0;

		for (int i = 0; i < accounts.length; i++) {

			for (int j = 0; j < accounts[i].length; j++) {

				customers[i] += accounts[i][j];

			}
		}

		for (int i = 0; i < customers.length - 1; i++) {

			if (customers[i] >= customers[i + 1]) {

				customers[i + 1] = customers[i];

			}
		}

		wealth = customers[customers.length - 1];

		return wealth;
	}
}