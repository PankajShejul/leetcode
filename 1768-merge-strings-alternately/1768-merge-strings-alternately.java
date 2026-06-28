class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        String small = "";
        String large = "";
        if(word1.length() < word2.length()) {
            small = word1;
            large = word2;
        } else {
            small = word2;
            large = word1;
        }
        for(int i=0; i<small.length(); i++) {
            result += String.valueOf(word1.charAt(i)) + 
            String.valueOf(word2.charAt(i));
        }
        if(small.length() < large.length()) {
           result += large.substring(small.length());
        }
        return result;
    }
}