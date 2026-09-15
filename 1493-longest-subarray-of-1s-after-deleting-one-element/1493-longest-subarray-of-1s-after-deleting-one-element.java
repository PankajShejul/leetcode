class Solution {
    public int longestSubarray(int[] nums) {
        int left=0, deletedCount=0, maxLen=0;;
        for(int right=0; right<nums.length; right++) {
            if(nums[right]==0) deletedCount++;

            while(deletedCount>1) {
                if(nums[left]==0) deletedCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1-deletedCount);
        }
        return deletedCount==0 ? maxLen-1 : maxLen;
    }
}