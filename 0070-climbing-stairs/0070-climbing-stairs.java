class Solution {
    
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap();
        return helper(n, map);
    }

    public int helper(int n, HashMap<Integer, Integer> map) {
        if(n<=2) return n;
        if(map.containsKey(n)) {
            return map.get(n);
        }
        int ways = helper(n-1, map)+helper(n-2, map);
        map.put(n, ways);
        return ways;
    }
}