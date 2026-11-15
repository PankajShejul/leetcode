class Solution {
    public int uniquePaths(int m, int n) {
         int[][] memo = new int[m][n];
        for(int[] row:memo) Arrays.fill(row, -1);

        return addUniquePaths(0,0, m, n, memo);
    }

    private int addUniquePaths(int verticalIndex, int horizontalIndex, int m, int n, int[][] memo) {
        if(verticalIndex== m-1 && horizontalIndex == n-1) return 1;
        if(verticalIndex>=m || horizontalIndex>=n) return 0;
        if(memo[verticalIndex][horizontalIndex]!=-1) return memo[verticalIndex][horizontalIndex];

        memo[verticalIndex][horizontalIndex]= addUniquePaths(verticalIndex+1, horizontalIndex, m, n, memo)+ addUniquePaths(verticalIndex, horizontalIndex+1, m,n, memo);
        return memo[verticalIndex][horizontalIndex];
    }
}
//             0,0
//     1,0             0,1
// 2,0     1,1     1,1     0,2   
// 2,1     2,0     1,2     1,2 0,3
// 2,2     2,1     (2,0|1,3)
// 2,3     2,2
// 2,4     2,3
// 2,5     2,4
// 2,6     2,5
//         2,6