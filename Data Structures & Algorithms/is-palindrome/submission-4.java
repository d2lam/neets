class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        char[] array = s.toCharArray();

        while (l<r) {
            if (array[l] != array[r] ) return false;
            l+=1;
            r-=1;
        }

        return true;

    }
}
