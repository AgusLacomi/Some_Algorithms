package numberOfSteps;

class Solution {

	public static void main(String[] args) {
		Solution first = new Solution();
		System.out.println(first.numberOfSteps(14));
	}

	public int numberOfSteps(int num) {

		if (0 > num || Math.pow(10, 6) < num) {
			throw new Error("Error");
		}

		double numberWithDecimal = num;
		int countOfSteps = 0;
		int backUp = 0;

		while (num != 0) {

			backUp = num;
			numberWithDecimal = num;

			numberWithDecimal = numberWithDecimal / 2;
			num = num / 2;

			if ((numberWithDecimal - num) > 0.0) {

				num = backUp - 1;
			}

			countOfSteps++;

		}

		return countOfSteps;

	}
}