class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m * k > bloomDay.length) return -1;

        int left = 1;
        int right = 0;

        for(int i : bloomDay) {
            right = Math.max(right, i);
        }

        int ans = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int bouquets = flowers(bloomDay, k, mid);

            if(bouquets >= m) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    // count how many bouquets can be made by day d
    int flowers(int arr[], int k, int d) {
        int b = 0;  
        int f = 0;  

        for(int i : arr) {
            if(i <= d) {  
                // flower blooms → increase streak
                f++;
                if(f == k) {  
                    b++;      
                    f = 0;    
                }
            } else {
                // flower has not bloomed → break streak
                f = 0;
            }
        }

        return b;
    }
}
