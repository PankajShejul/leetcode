class Solution {
    public int rob(int[] nums) {
         if (nums.length == 1) return nums[0];
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        int case1 = robHelper(nums, 0, dp, nums.length-2);

        Arrays.fill(dp, -1);

        int case2 = robHelper(nums, 1, dp, nums.length-1);
        return Math.max(case1, case2);
    }

    private int robHelper(int[] nums, int i, int[] dp, int last) {
        if (i > last) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i] = Math.max(nums[i]+robHelper(nums, i+2, dp, last), robHelper(nums, i+1, dp,last));
        return dp[i];
    }
}