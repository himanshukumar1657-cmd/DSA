class Solution {
    public int tribona(int n,int []dp) {
       if(n==0) return 0;
       if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n];
    int ans=tribona(n-1,dp)+tribona(n-2,dp)+tribona(n-3,dp);
    dp[n]=ans;
    return ans;
    }

    public int tribonacci(int n) {
        int dp[]=new int[n+1];
      return tribona(n,dp);


        
    }
}