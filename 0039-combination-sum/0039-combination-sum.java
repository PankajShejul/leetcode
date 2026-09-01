class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> path = new ArrayList();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, path, result);
        return result;
    }

    private void backtrack(int[] candidates, int remainingTarget, int startIndex, 
                           List<Integer> currentCombination, List<List<Integer>> result) {
        // Base case: found a valid combination
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Iterate through candidates starting from startIndex
        for (int i = startIndex; i < candidates.length; i++) {
            // Pruning: if the current candidate is larger than the remaining target,
            // subsequent candidates (which are larger due to sorting) will also fail.
            if (candidates[i] > remainingTarget) {
                break;
            }

            // Choose: add the candidate to the current combination
            currentCombination.add(candidates[i]);
            
            // Explore: recurse with the same index 'i' to allow reuse of the same element
            backtrack(candidates, remainingTarget - candidates[i], i, currentCombination, result);
            
            // Un-choose: remove the last added element (backtrack)
            currentCombination.remove(currentCombination.size() - 1);
        }
      }
}