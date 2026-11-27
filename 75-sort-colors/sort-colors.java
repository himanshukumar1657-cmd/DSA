class Solution {
    public void Swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                Swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                Swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
        
    }
}