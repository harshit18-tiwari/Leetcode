class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                dp[i][j] = -1;
            }
        }

        return ways(0,0,m,n,dp);
    }

    public int ways(int r,int c,int m,int n, int[][] dp) {
        if(r==m-1 && c==n-1) return 1;
        if(r>=m || c>=n) return 0;

        if(dp[r][c] != -1) return dp[r][c];

        int rightWays = ways(r,c+1,m,n,dp);
        int downWays = ways(r+1,c,m,n,dp);

        return dp[r][c] = rightWays+downWays;
    } 
}