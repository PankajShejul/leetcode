class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, result, new ArrayList(), used);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> path, boolean[] used) {
        if(path.size() == nums.length) {
            result.add(new ArrayList(path));
            return;
        }

        for(int i=0;i<nums.length; i++) {
            if(used[i]|| (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;

            path.add(nums[i]);
            used[i]= true;

            backtrack(nums, result, path, used);

            path.remove(path.size()-1);
            used[i] = false;
            
        }
    }
}