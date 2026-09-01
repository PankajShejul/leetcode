class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> path = new ArrayList();
        Set<Integer> set = new HashSet<>();
        dfs(result, path, nums, set);
        return result;
    }

    public void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, Set<Integer> visitedSet) {
        if(path.size() == nums.length) {
            result.add(new ArrayList(path));
            return;
        }

        for(int n=0;n<nums.length; n++) {
            if(visitedSet.contains(nums[n])) continue;
            path.add(nums[n]);
            visitedSet.add(nums[n]);
            dfs(result, path, nums, visitedSet);
            path.remove(path.size()-1);
            visitedSet.remove(nums[n]);
        }
    }
}