class Solution {
    public int maxSubArray(int[] nums) {
        int s=nums[0];
        int g=nums[0];
        for(int i=1;i<nums.length;i++){ 
           g=Math.max(nums[i],nums[i]+g);
           s=Math.max(g,s);
        }
        return s;
    }
}