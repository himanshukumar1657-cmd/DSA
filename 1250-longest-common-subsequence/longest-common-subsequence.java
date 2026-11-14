class Solution {
    public int lcs(StringBuilder a, StringBuilder b,int i,int j,int dp[][]){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+lcs(a,b,i-1,j-1,dp);
        }
        else{
            return dp[i][j]=Math.max(lcs(a,b,i-1,j,dp),lcs(a,b,i,j-1,dp));
        }

    }
    public int longestCommonSubsequence(String text1, String text2) {
           StringBuilder a=new StringBuilder(text1);
           StringBuilder b=new StringBuilder(text2);
           int n=a.length();
           int m=b.length();
           int dp[][]=new int[n][m];
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
           }
           return lcs(a,b,n-1,m-1,dp);
        
    }
}