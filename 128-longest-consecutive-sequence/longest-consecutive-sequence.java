class Solution {
    public int longestConsecutive(int[] nums) {
       
        HashSet<Integer> in=new HashSet<>();
        int maxin=0;
        for(int i=0;i<nums.length;i++){
            in.add(nums[i]);
             }
             for(int num:in){
                if(!in.contains(num-1)){
                    int curr=num;
                    int currstr=1;
                    while(in.contains(curr +1)){
                        curr++;
                        currstr++;
                       }
                     maxin=Math.max(maxin,currstr);
                }
             }
             return maxin;
        
    }
}