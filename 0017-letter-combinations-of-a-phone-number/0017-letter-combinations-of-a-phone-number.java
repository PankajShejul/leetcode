class Solution {
    public final String[] KEYPAD = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        dfs(digits, 0, new StringBuilder(), result);
        return result;
    }

    public void dfs(String digits, int index, StringBuilder current,List<String> result) {
        if(digits.length()== index) {
            result.add(current.toString());
            return;
        }
        int i = digits.charAt(index)-'0';
        String str = KEYPAD[i];
        for(Character c:str.toCharArray()) {
            current.append(c);
            dfs(digits, index+1, current, result);
            current.deleteCharAt(current.length()-1);
        }
    }
}