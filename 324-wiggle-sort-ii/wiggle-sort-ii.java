class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans[]=new int[n];
        int odd=1;
        int even=0;
        for(int i=n-1;i>=0 && odd<n;i--){
           ans[odd]=nums[i];
           odd+=2;
        }

        for(int i= (n + 1) / 2 - 1;i >= 0 && even < n;i--){
           ans[even]=nums[i];
           even+=2;
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }

        
    }
}