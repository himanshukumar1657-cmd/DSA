import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int right=0;
        int left=height.length-1;
        int maxwater=0;

        while(right<left){
            int width=left-right;
            int current=Math.min(height[left],height[right]);
            int area= current*width;
            
            if(area>maxwater){
              maxwater=area;

            }
            if(height[right]>height[left]){
                left--;
            }
            else{
                right++;
            }
            
            

        }
        return maxwater;
        
    }
}