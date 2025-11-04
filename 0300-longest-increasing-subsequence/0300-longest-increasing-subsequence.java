class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]){
                    if(dp[j]+1 > dp[i]){
                        dp[i]=dp[j]+1;
                        parent[i]=j;
                    }
                }
            }
        }
        int max=-1;
        int li=0;
        for(int i=0;i<n;i++){
            if(dp[i] > max){
                max=dp[i];
                li=i;
            }
        }
        List<Integer> lis=new ArrayList<>();
        lis.add(arr[li]);
        while(parent[li] != li){
            li=parent[li];
            lis.add(arr[li]);
        }
        System.out.println(lis);
       return max;
    }
}