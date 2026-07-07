class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String smaller = "";
        String greater = "";
        if(str1.length()<=str2.length()) {
            smaller = str1;
            greater = str2;
        } else {
            smaller = str2;
            greater = str1;
        }
        int gcd = smaller.length();
        boolean gcdFound = false;
    
        for(int i = smaller.length()-1; i >=0; i--) {
            if(greater.contains(smaller.substring(0, i+1)) && greater.length()%smaller.substring(0, i+1).length() == 0) {
                int gMultiple = greater.length()/smaller.substring(0,i+1).length();
                int sMultiple = smaller.length()/smaller.substring(0,i+1).length();
                String greaterResult = "";
                String smallerResult = "";
                for(int j=0;j<gMultiple;j++) {
                    greaterResult+=smaller.substring(0,i+1);
                }
                for(int j=0;j<sMultiple;j++) {
                    smallerResult+=smaller.substring(0,i+1);
                }
                if(greaterResult.equals(greater) && smallerResult.equals(smaller)) return smaller.substring(0, i+1);
            }
        }
        return "";
    }
}