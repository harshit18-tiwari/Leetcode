class Solution {
    public int findFinalValue(int[] nums, int original) {
        return search(nums,original)?findFinalValue(nums,original*2):original;
    }
    public boolean search(int []nums,int target){
        for(int val:nums){
            if(val==target)return true;
        }
        return false;
    }
}