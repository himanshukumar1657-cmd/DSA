class Solution {
    public int maximumGap(int[] nums) {
        int maxgap=Integer.MIN_VALUE;
                if (nums.length < 2)
            return 0;
            Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
           // int dif=Math.abs(nums[i]-nums[i-1]);
           maxgap=Math.max(maxgap,nums[i]-nums[i-1]); 
        }

        return maxgap;
    }
}