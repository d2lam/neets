class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = Map.of(
           ')','(',
           ']','[',
           '}','{' 
        );

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (st.isEmpty()) return false;
                if (st.pop() != map.get(c)) return false;
            }
            else {
                st.push(c);
            }
        }

        return st.isEmpty();
    }
}


