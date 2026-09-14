class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
     List<List<Integer>> result = new ArrayList();
     backtrack(1, k, n, result, new ArrayList());

     return result;
    }

    public void backtrack(int start, int k,int n, List<List<Integer>> result, List<Integer> current) {
        if(current.size() == k) {
            int sum = current.stream().mapToInt(Integer::intValue).sum();

            if(sum == n) result.add(new ArrayList(current));
            return;
        }

        for(int i=start; i<=9; i++) {
            current.add(i);
            backtrack(i+1, k, n, result, current);
            current.remove(current.size()-1);
        }

    }
}