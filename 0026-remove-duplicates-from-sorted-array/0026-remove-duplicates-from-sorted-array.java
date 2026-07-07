class Solution {
    public int removeDuplicates(int[] nums) {
        //[1,1,1,2,2,3,4,4,4]
        //[1,2,3,4]

        int i=0;
        int j=1;
        int count = 1;
        while(j<nums.length) {
            if(nums[i] != nums[j])  {
                nums[count]=nums[j];
                count++;
                i=j;
            }
            j++;
        }
        return count;
    }
}