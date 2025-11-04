class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long count = 0;

       for(int ele : nums) {
            if(ele==0) {
                count++;
                ans+=count;
            }
            else {
                count=0;
            }
       }

       return ans;
    }
}