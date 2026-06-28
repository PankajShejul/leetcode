class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;
        while(r<nums.length && l<nums.length) {
            if(nums[r]!=0 && nums[l]==0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if(nums[l] !=0) l++;
            if(r<l || nums[r]==0) r++;
        }
    }
}