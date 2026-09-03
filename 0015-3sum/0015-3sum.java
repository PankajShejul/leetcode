class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfList = new ArrayList<>();
        Arrays.sort(nums);
        
      
        for(int i=0; i< nums.length-2; i++) {
            // if(nums[i]>0) break;
            int j=i+1;
            int k = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k) {
                
                if((nums[i]+nums[j]+nums[k])==0) {
                    listOfList.add(List.of(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } else if((nums[i]+nums[j]+nums[k])>0) {
                    k--;
                } else if((nums[i]+nums[j]+nums[k])<0) {
                    j++;
                }
            }
        }
        return listOfList;
    }
}