package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public static void main(String[] args) {
		Solution first = new Solution();
		
		System.out.println(first.fizzBuzz(5));
	}

	public List<String> fizzBuzz(int n) {

		List<String> myList = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {

			if (i % 15 == 0) {
				myList.add("FizzBuzz");
			} else if (i % 3 == 0) {
				myList.add("Fizz");
			} else if (i % 5 == 0) {
				myList.add("Buzz");
			} else {
				String number = Integer.toString(i);

				myList.add(number);
			}
		}

		return myList;
	}
}