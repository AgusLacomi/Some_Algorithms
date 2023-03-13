package lenghtOfLastWord;

//By AgusLacomi

class Solution {
    public int lengthOfLastWord(String s) {

        char[] sToCharArray = s.toCharArray();

        int position = sToCharArray.length - 1;
        int output = 0;
        boolean firstSpace = true;

        while (firstSpace && position >= 0) {

            if (sToCharArray[position] != ' ' && firstSpace) {

                output++;

            } else if (output > 0 && sToCharArray[position] == ' ') {

                return output;

            }

            position--;
        }

        return output;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.lengthOfLastWord("s");
    }
}