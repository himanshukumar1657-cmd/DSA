class Solution {
    public int lcs(StringBuilder a,StringBuilder b,int i,int j,int[][]dp){
          if(i<0 || j<0) return 0;
          if(dp[i][j]!=-1) return dp[i][j];
         if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+lcs(a,b,i-1,j-1,dp);
         }
         else{
            return dp[i][j]=Math.max(lcs(a,b,i-1,j,dp),lcs(a,b,i,j-1,dp));
         }


    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }
    public int longestCommonSequence(String text1,String text2){
        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return lcs(a,b,m-1,n-1,dp);


    }
    public int longestpalindronString(String s){
        return longestCommonSequence(s,reverse(s));



    }
    public int minInsertions(String s) {
        return s.length()-longestpalindronString(s);
        
    }
}