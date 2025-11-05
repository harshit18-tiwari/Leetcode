class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long maxDiff = 0;   
        long maxNum = 0;   

        for (int x : nums) {
            ans = Math.max(ans, maxDiff * x);   
            maxDiff = Math.max(maxDiff, maxNum - x);
            maxNum = Math.max(maxNum, x);
        }

        return ans;
    }
}
