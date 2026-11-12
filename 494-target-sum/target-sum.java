class Solution {
    public int way(int []nums,int target,int i){
        if(i==nums.length){
            if(target==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int add=way(nums,target-nums[i],i+1);
        int sub=way(nums,target+nums[i],i+1);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
       
       return way(nums,target,0);
        
    }
}