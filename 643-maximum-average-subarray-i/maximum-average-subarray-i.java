class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=k;
        int sum=0;
        for(int m=0;m<k;m++){
            sum+=nums[m];
        }
        int max=sum;
        while(i<n && j<n){
             sum=sum-nums[i]+nums[j];
            max=Math.max(sum,max);
            i++;
            j++;
        }
        double ans=(double)max/k;
        return ans;
        
    }
}