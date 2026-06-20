class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int presmaller[]=new int[n];
        int nextsmaller[]=new int[n];
        // nextsmaller
        Stack<Integer>in=new Stack<>();
        in.push(n-1);
        nextsmaller[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(in.size()>0 && heights[in.peek()]>=heights[i]){
                in.pop();

            }
            if(in.size()==0)nextsmaller[i]=n;
            else nextsmaller[i]=in.peek();
            in.push(i);
            
        }
        // empty the stack
        while(in.size()>0){
            in.pop();
        }
        presmaller[0]=-1;
        in.push(0);
        
          for(int i=1;i<n;i++){
            while(in.size()>0 && heights[in.peek()]>heights[i]){
                in.pop();

            }
            if(in.size()==0)presmaller[i]=-1;
            else presmaller[i]=in.peek();
            in.push(i);
            
        }
        int max=-1;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nextsmaller[i]-presmaller[i]-1);
            max=Math.max(max,area);

        }
        return max; 

        
        
    }
}