class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> matchingMap = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );

        for (char c : s.toCharArray()) {
            if (matchingMap.containsKey(c)) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != matchingMap.get(c)) return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}


// Stack<Character> st = new Stack<>();
//         Map<Character, Character> map = Map.of(
//            ')','(',
//            ']','[',
//            '}','{' 
//         );

//         for (char c : s.toCharArray()) {
//             if (map.containsKey(c)) {
//                 if (st.isEmpty()) return false;
//                 if (st.pop() != map.get(c)) return false;
//             }
//             else {
//                 st.push(c);
//             }
//         }

//         return st.isEmpty();