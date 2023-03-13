package plusOne;

//BY AgusLacomi

/*Imposible solve like this out
 * Out of bounds
 * 
 * // String digitsToString = "";

    // for (int i = 0; i < digits.length; i++) {

    // digitsToString += Integer.toString(digits[i]);

    // }

    // long value = Long.parseLong(digitsToString) + 1;
    // digitsToString = Long.toString(value);

    // char[] valueToCharArray = digitsToString.toCharArray();

    // digits = new int[valueToCharArray.length];

    // for (int i = 0; i < digits.length; i++) {
    // digits[i] = Character.getNumericValue(valueToCharArray[i]);
    // }

    // return digits;
 */

public class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // That makes sense, cause only will enter when some number in the array of
        // numbers are equal tan 9
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] Vector = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        solution.plusOne(Vector);
    }

}
