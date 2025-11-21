class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++) {
            int t = nums[i];
            int temp = nums[i-1];
            if(t==temp) return temp;
        }

        return -1;
    }
}