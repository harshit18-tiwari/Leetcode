class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i=0;i<nums.length;i++) {
            res[i] = nums[i];
        }

        Arrays.sort(res);
        for(int i=0;i<nums.length;i++) {
            int count = 0;

            for(int j=0;j<res.length;j++) {
                if(res[j]<nums[i]) {
                    count++;
                }
                else {
                    break;
                }
               
            }

             nums[i]=count;
            
        }

        return nums;
    }
}