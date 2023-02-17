package commonPrefix;

class Solution {

    public static void main(String[] args) {

        Solution a = new Solution();

        String[] strs = { "flower", "flow", "flight" };

        a.longestCommonPrefix(strs);

    }

    public String longestCommonPrefix(String[] strs) {

        char[][] letters = new char[strs.length][];

        for (int i = 0; i < strs.length; i++) {

            letters[i] = strs[i].toCharArray();
        }

        char[] prefix = new char[];

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < letters[i].length; j++) {

                if (letters)

            }

        }

    }
}