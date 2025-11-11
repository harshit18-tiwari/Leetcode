class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] result = new int[nums.length];
        // int left = 0; 
        // int right = nums.length - 1; 
        // int index = nums.length - 1; 

       
        // while (left <= right) {
        //     int leftSquare = nums[left] * nums[left];
        //     int rightSquare = nums[right] * nums[right];

            
        //     if (leftSquare > rightSquare) {
        //         result[index] = leftSquare;
        //         left++;
        //     } else {
        //         result[index] = rightSquare;
        //         right--;
        //     }
        //     index--;
        // }

        // return result;
        




    int n = nums.length;
    int [] arr = new int[n];

    int l = 0;
    int r = nums.length-1;
    int index = nums.length-1;

    while(l<=r) {
        int left = nums[l]*nums[l];
        int right = nums[r]*nums[r];

        if(left>right) {
            arr[index] = left;
            l++;
        } else {
            arr[index] = right;
            r--;
        }
        index--;
    }

    return arr;




    











    }
}