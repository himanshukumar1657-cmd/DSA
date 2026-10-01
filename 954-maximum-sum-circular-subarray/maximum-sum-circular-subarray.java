class Solution {
    public int kadan(int []nums){
        int n=nums.length;
        int sum=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==0) return 0;
        int x=kadan(nums);
        int y=0;
        for(int i=0;i<nums.length;i++){
            y+=nums[i];
            nums[i]*=-1;

        }
        int z=kadan(nums);
        if(y+z==0) return x;
        return Math.max(x,y+z);

    }
}