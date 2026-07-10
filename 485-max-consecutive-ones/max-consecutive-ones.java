class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i:nums){
            
            if(i==1){
                count++;
                max=Math.max(max,count);
            }
            
            if(i==0){
                count=0;
            }
        }
        return max;
    }
}