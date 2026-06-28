class Solution {
    public boolean isSubsequence(String s, String t) {
        int sptr=0;
        int tptr=0;
        while(tptr<t.length() && sptr<s.length()) {
            if(s.charAt(sptr) == t.charAt(tptr)) {
                sptr++;
            }
            tptr++;
        }

        if(sptr>=s.length()) return true;
        return false;
    }
}