class Solution {
    public int longestOnes(int[] nums, int k) {
        int Zerocount=0;
        int start=0;
        int longmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                Zerocount++;
            }
            while(Zerocount>k){
                if(nums[start]==0){
                    Zerocount--;
                   
                }
                 start++;
            }
            longmax=Math.max(longmax,i-start+1);
        }
        return longmax;
        
    }
}