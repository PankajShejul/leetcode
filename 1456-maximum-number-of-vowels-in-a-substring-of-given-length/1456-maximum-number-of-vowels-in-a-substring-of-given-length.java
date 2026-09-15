class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int max = 0;
        int count = 0;
        for(int i=0; i<k; i++) {
            if(vowels.contains(s.charAt(i))) count++;
        }
        max=count;
        for(int i=k;i<s.length();i++) {
            if(vowels.contains(s.charAt(i))) count++;
            if(vowels.contains(s.charAt(i-k))) count--;
            if(max<count) max=count;
        }
        return max;
    }
}