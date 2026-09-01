class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        backtrack(1, result, current, n, k);
        return result;
    }

    public void backtrack(int start, List<List<Integer>> result, List<Integer> current, int n, int size) {
        if(current.size()==size) {
            result.add(new ArrayList(current));
            return;
        }

        for(int i=start; i<=n; i++) {
            current.add(i);
            backtrack(i+1,result, current, n , size);
            current.remove(current.size()-1);
        }
    }
}