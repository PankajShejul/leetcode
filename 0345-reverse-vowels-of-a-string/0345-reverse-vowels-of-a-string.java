class Solution {
    public String reverseVowels(String s) {
        boolean[] isVowel = new boolean[128];
        for(char c: "aeiouAEIOU".toCharArray()) {
            isVowel[c]= true;
        }
        char[] str = s.toCharArray();
        int i=0;
        int j=str.length-1;
        while(i<j) {
            while(i<j && !isVowel[str[i]]) i++;
            while(i<j && !isVowel[str[j]]) j--;
            if(i<j) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}