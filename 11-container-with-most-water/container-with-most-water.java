class Solution {
    public int maxArea(int[] height) {
        //Arrays.sort(height);
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int width= right-left;
            int are=Math.min(height[right],height[left])*width;
            maxArea=Math.max(maxArea,are);
            if(height[left]<height[right]) left++;
            else right--;
        }

        return maxArea; 
    }
   
}