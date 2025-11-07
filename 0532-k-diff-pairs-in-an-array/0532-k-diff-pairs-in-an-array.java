import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = 1, count = 0, n = nums.length;
        
        while (i < n && j < n) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                count++;
                i++;
                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) i++;
        }
        return count;
    }
}
