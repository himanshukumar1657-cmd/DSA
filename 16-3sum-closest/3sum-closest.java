import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int result=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(result-target);
        for(int i=0;i<nums.length-2;i++){
           int low=i+1;
           int high=nums.length-1; 
           while(low<high){
            int sum=nums[low]+nums[high]+nums[i];
            int currdiff=Math.abs(sum-target);

            if(currdiff<diff){
                diff=currdiff;
                result=sum;
            }
            else if(currdiff==diff){
                result=Math.max(sum,result);
            }
            if(sum<target){
                low++;
            }
            else{
                high--;
            }
           }
        }
        return result;
        
       
        
    }
}