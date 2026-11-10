class Solution {
    public boolean perfectSqure(int i){
        int sqrt=(int)(Math.sqrt(i));
        if(sqrt*sqrt==i){
            return true;
        }
        else{
            return false;
        }
    }
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(perfectSqure(i)){
                    dp[i]=1;
                }
                else{
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int count=dp[j*j] + dp[i-j*j];
                 min=Math.min(count,min);
                 dp[i]=min;
                }
                
               
            }
            
        }

        return dp[n];
    }
}