class Solution {
    public int way(int []nums,int target,int i,int dp[][],int sum,int res){
        if(i==nums.length){
            if(res==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[i][sum+res]!=-1) return dp[i][sum+res];
        int add=way(nums,target,i+1,dp,sum,res+nums[i]);
        int sub=way(nums,target,i+1,dp,sum,res-nums[i]);
        return dp[i][sum+res]=add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int ele:nums) sum+=ele;
        int dp[][]=new int[nums.length][2*sum+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
       
       return way(nums,target,0,dp,sum,0);
       
    }
}