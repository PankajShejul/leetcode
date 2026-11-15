class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n= grid[0].length;
        int[][] memo = new int[m][n];
        for(int[] row: memo) Arrays.fill(row, Integer.MAX_VALUE);
        return minPath(0, 0, grid, m, n, memo);
    }

    private int minPath(int i, int j, int[][] grid, int m, int n, int[][] memo) {
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(memo[i][j]!=Integer.MAX_VALUE) return memo[i][j];
        if(i==m-1 && j==n-1)  return grid[i][j];

        memo[i][j]=grid[i][j]+Math.min(minPath(i+1, j, grid, m, n, memo), minPath(i, j+1, grid, m, n, memo));
        return memo[i][j];
    }
}