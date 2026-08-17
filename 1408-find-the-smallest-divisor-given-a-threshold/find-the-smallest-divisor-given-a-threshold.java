class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int low=1;
        int high=max;
        while(low<high){
           int mid=(low+high)/2;
           if(findDivisor(nums,mid,threshold)){
            high=mid;
           }
           else{
          low=mid+1;
           }

        }
        return low;

        
    }
    public boolean findDivisor(int[] nums,int divident,int threshold){
        int finish=0;
        for(int i:nums){
            finish+=(int)Math.ceil((double)i/divident);
        }
        return finish<=threshold;

    }
}