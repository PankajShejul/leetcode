class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];
        for(int[] row: memo) Arrays.fill(row, -1);
        return addUniquePaths(0,0, obstacleGrid, memo, m, n);
    }

    private int addUniquePaths(int i, int j, int[][] obstacleGrid, int[][] memo, int m, int n) {
        if(i>=m || j>=n || obstacleGrid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(memo[i][j]!= -1) return memo[i][j];
        memo[i][j]=addUniquePaths(i+1, j, obstacleGrid, memo, m, n) +
        addUniquePaths(i, j+1, obstacleGrid, memo, m, n);
        return memo[i][j];
    }
}

