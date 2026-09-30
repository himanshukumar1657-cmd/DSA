class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
         int rightsum=0;
        for(int m:nums){
            rightsum+=m;
        }
       
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
           if(leftsum==rightsum){
            return i;
           }
           else{
            leftsum+=nums[i];
           }
        }
        return -1;
        
    }
}