class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        char[] array = s.toCharArray();

        while (l < r) {
            if (!Character.isLetterOrDigit(array[l])) {
                l++;
            } else if (!Character.isLetterOrDigit(array[r])) {
                r--;
            } else {
                if (Character.toLowerCase(array[l]) != Character.toLowerCase(array[r])) return false;
                l += 1;
                r -= 1;
            }
        }

        return true;
    }
}