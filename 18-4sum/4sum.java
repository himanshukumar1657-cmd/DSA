class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        for(int i=0;i<n-3;i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<n-2;j++){
                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                    int low=j+1;
                    int high=nums.length-1;
                    while(low<high){
                        long sum=(long)nums[i]+nums[j]+nums[low]+nums[high];
                        if(sum==target){
                            ArrayList<Integer> s=new ArrayList<>();
                            s.add(nums[i]);
                            s.add(nums[j]);
                            s.add(nums[low]);
                            s.add(nums[high]);
                            ans.add(s);
                             low++;
                             high--;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                        while (low < high && nums[high] == nums[high + 1]) high--;

                        }
                        else if(sum>target){
                            high--;
                        }
                        else{
                            low++;
                        }
                    
            
        }
            
        }

        }
        return ans;
        
    }
}