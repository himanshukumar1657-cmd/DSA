class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int [] ans=new int [nums.length];     
       Stack<Integer>stack=new Stack<>();
       for(int i=0;i<nums.length;i++){
        ans[i]=-1;
       } 
       for(int i=0;i<nums.length;i++){
         while(true){
            if(stack.isEmpty()){
                stack.push(i);
                break;
            }
            int idx=stack.peek();
            if(nums[i]>nums[idx]){
                ans[idx]=nums[i];
                stack.pop();

            }
            else{
                stack.push(i);
                break;
            }
         }
       }
   
     
        for(int i=0;i<nums.length;i++){
         while(true){
            if(stack.isEmpty()){
                stack.push(i);
                break;
            }
            int idx=stack.peek();
            if(nums[i]>nums[idx]){
                ans[idx]=nums[i];
                stack.pop();

            }
            else{
                stack.push(i);
                break;
            }
         }
       }
   return ans;
     }
     
}
