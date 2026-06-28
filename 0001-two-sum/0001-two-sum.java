class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean solutionFound = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            Integer complement = target - nums[i];
            if(hm.containsKey(complement)) {
                result[1] = i;
                result[0] = hm.get(complement);
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}