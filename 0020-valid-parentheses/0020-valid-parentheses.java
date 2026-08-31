class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']', '[');

        for(char t: s.toCharArray()) {
            if(map.containsKey(t)) {
                if(stack.isEmpty() || stack.pop() !=map.get(t)) return false;
            } else {
                stack.push(t);
            }
        }
        return stack.isEmpty();
    }
}