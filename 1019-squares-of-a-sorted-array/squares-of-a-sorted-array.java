class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        int head=0;
        int tail=n-1;
        for(int j=n-1;j>=0;j--){
            if(nums[head]>nums[tail]){
             result[j]=nums[head];
             head++;
            }
            else{
             result[j]=nums[tail];
              tail--;
            }
        }       
   
return result;
 }
}