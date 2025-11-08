class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag=false;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]<=nums[i+1]){
            flag=true;
          }
          else{
            flag=false;
            break;
          }
        }
        if(flag==false){
            for(int i=0;i<nums.length-1;i++){
          if(nums[i]>=nums[i+1]){
            flag=true;
          }
          else{
            flag=false;
            break;
          }
        }
        }
        return flag;
    }
}