class Solution {
    public int robloot(int arr [],int idx,int [] dp ){
        
        if(idx >=arr.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];

         int ste=arr[idx] +robloot(arr,idx+2,dp);
         int sk = robloot(arr,idx+1,dp);
         return dp[idx]= Math.max(ste,sk);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return robloot(nums,0,dp);
        
        
    }
}