class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        Character[] array = s.toCharArray();

        while (l<=r) {
            if (array[l] != array[r] ) return false;
            l++;
            r--;
        }

        return true;

    }
}
