class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;

        if(start==destination) {
            return 0;
        }

        int total = 0;
        
        for(int i=0;i<n;i++) {
            total += distance[i];
        }
        int clockwise = 0;
        
        for(int i=start; i!=destination; i=(i+1)%n) {
            clockwise += distance[i];
        }

        return Math.min(clockwise,total-clockwise);
    }
}