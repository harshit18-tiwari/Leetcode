class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        return profit(nums,0,dp);
    }

    public int profit(int[] nums, int i, int[] dp) {
        int n = nums.length;
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];

        int take = nums[i] + profit(nums,i+2,dp);
        int skip = profit(nums,i+1,dp);

        return dp[i] = Math.max(take,skip);
    }
}