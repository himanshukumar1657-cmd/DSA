class Solution {
    public boolean subset(int nums[],int i,int target,int dp[][]){
        if(i==nums.length){
            if(target==0){
                return true;
            }
            else{
                return false;
            }
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans=false;
         boolean skip=subset(nums,i+1,target,dp);
        if(target-nums[i]<0){
           ans=skip;
        }
        else{
          boolean keep=subset(nums,i+1,target-nums[i],dp);
          ans=skip||keep;
        } 
        if(ans) dp[i][target]=1;
        else dp[i][target]=0;
        return ans;
        

    }
    public boolean canPartition(int[] nums) {
         int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return subset(nums,0,target,dp);
    }
}