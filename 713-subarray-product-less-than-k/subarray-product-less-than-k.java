class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int start=0;
        int prod=1;
        if(k<=1) return 0;
        for(int end=0;end<n;end++){
           prod=prod*nums[end];
           while(prod>=k){
            prod=prod/nums[start];
            start++;
           }
            count+=end-start+1;
           }
       return count;
        }
        
    }
