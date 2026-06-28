class Solution {
    public int maxOperations(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length;i++) {
            if (null == map.get(k-nums[i])) {
                if (null == map.get(nums[i])) {
                    map.put(nums[i], 1);
                } else {
                    int temp = map.get(nums[i]);
                    map.put(nums[i], ++temp);
                }
            } else {
                int temp = map.get(k-nums[i]);
                if(temp == 1) {
                    map.remove(k-nums[i]);
                } else {
                    map.put(k-nums[i], --temp);
                }
                count++;
            }
        }
        return count;
    }
}