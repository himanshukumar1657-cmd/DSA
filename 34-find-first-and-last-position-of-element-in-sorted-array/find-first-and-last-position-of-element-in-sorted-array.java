class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=first_searchRange(nums,target);
        int last=last_searchRange(nums,target);
        return new int[]{first,last};
    }
        public int first_searchRange(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
                
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                   high=mid-1;
                }
            }
            
            return index;
        }
        public int last_searchRange(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
                
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                   high=mid-1;
                }
            }
            
            return index;
        }
        
    }

