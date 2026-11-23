class Solution {
    public int calculate(StringBuilder a, StringBuilder b,int i,int j,int [][]dp) {
      if(i==-1) return j+1;
      if(j==-1) return i+1;
      if(dp[i][j]!=-1) return dp[i][j];
      if(a.charAt(i)==b.charAt(j)){
         return dp[i][j]=calculate(a,b,i-1,j-1,dp);
      }
    
        int delete=calculate(a,b,i-1,j,dp);
        int insert=calculate(a,b,i,j-1,dp);
        int repl=calculate(a,b,i-1,j-1,dp);
        return dp[i][j]=1+Math.min(delete,Math.min(insert,repl));
    
        
    }
    
    public int minDistance(String word1, String word2) {
     StringBuilder a=new StringBuilder(word1);
     StringBuilder b=new StringBuilder(word2);
     int m=a.length();
     int n=b.length();
     int dp[][]=new int[m][n];
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
     }
     return calculate(a,b,m-1,n-1,dp);
        
    }
}