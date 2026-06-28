class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(x>nums[i]) {
                x=nums[i];
            }
            if(x<nums[i] && nums[i]<y) {
                y=nums[i];
            }
            if(x<y && y<nums[i]) return true;
        }
        return false;
    }
}