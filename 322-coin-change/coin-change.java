class Solution {
    public long coinChange1(int[]coins, int amount,int i,long dp[][]){
         if(coins.length==i){
            if(amount==0){
                return 0;
            }
            else{
                return Integer.MAX_VALUE;
            }
         }
       if(dp[i][amount]!=-1) return dp[i][amount];
       long skip=coinChange1(coins,amount,i+1,dp);
       if(amount - coins[i]<0) return dp[i][amount]=skip;
       long pick=1+coinChange1(coins,amount-coins[i],i,dp);
       
       return dp[i][amount]=Math.min(pick,skip);

    }

    public int coinChange(int[] coins, int amount) {
        long dp[][]=new long[coins.length][amount+1]; 
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
           dp[i][j]=-1;
            }
        }
        int ans=(int)coinChange1(coins,amount,0,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
}