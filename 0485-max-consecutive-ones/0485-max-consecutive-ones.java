class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consec = 0;
        for(int i: nums) {
            if(i==1) {
                consec++;
                if(max<consec) {
                    max=consec;
                }
            }
            if(i==0) {
                
                consec = 0;
            }
        }
        return max;
    }
}