package romanToInteger;

public class Solution {

	public int romanToInt(String s) {

		if (s.length() > 15 || s.length() < 1) {
			throw new Error("Roman numeral invalid");
		}

		char[] romanCharArray = s.toCharArray();

		int[] intArray = getIntArray(romanCharArray);

		int number = getNumber(intArray);

		return number;
	}

	private int[] getIntArray(char[] romanCharArray) {

		int i = 1;
		int v = 5;
		int x = 10;
		int l = 50;
		int c = 100;
		int d = 500;
		int m = 1000;

		int[] intArray = new int[romanCharArray.length];

		for (int j = 0; j < romanCharArray.length; j++) {

			if (romanCharArray[j] == 'I') {
				intArray[j] = i;

			} else if (romanCharArray[j] == 'V') {
				intArray[j] = v;

			} else if (romanCharArray[j] == 'X') {
				intArray[j] = x;

			} else if (romanCharArray[j] == 'L') {
				intArray[j] = l;

			} else if (romanCharArray[j] == 'C') {
				intArray[j] = c;

			} else if (romanCharArray[j] == 'D') {
				intArray[j] = d;

			} else {
				intArray[j] = m;

			}
		}

		return intArray;
	}

	private int getNumber(int[] intArray) {

		int number = 0;

		for (int i = 0; i < intArray.length; i++) {

			int position1 = intArray[i];

			if (i + 1 < intArray.length) {

				int position2 = intArray[i + 1];

				if (position1 >= position2) {
					number += position1;
				} else {
					number -= position1;
				}
			} else {
				number += position1;
			}
		}
		return number;
	}

}
