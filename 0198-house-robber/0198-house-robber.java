class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            dp[i]=-1;
        }
        return robHelper(nums, 0, dp);
    }

    private int robHelper(int[] nums, int i, int[] dp) {
        if(i>nums.length-1) return 0;
        if (dp[i] != -1) {
            return dp[i]; // already filled
        }
        dp[i] =  Math.max(nums[i]+robHelper(nums, i+2, dp),
        robHelper(nums, i+1, dp));
        return dp[i];
    }
}