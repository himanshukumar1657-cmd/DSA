class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index=searchindex(matrix,target);
        if(index!=-1)return searchvalue(matrix,index,target);
        return false; 
       }
       public int searchindex(int matrix [][],int target){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
             int mid=low+(high-low)/2;
             int last=matrix[mid].length-1;
             if(matrix[mid][0]<=target && target<= matrix[mid][last]){
                return mid;
             }
             else if(matrix[mid][0]<target){
                low=mid+1;
             }
             else if(matrix[mid][0]>target){
                high=mid-1;
             }
             

        }
        return -1;
         }
         public boolean searchvalue(int matrix[][],int index,int target){
            int low=0;
            int high=matrix[index].length-1;
            while(low<=high){

                  int mid=low+(high-low)/2;
             if(matrix[index][mid]==target){
                return true;
             }
             else if(matrix[index][mid]<target){
                low=mid+1;
             }
             else if(matrix[index][mid]>target){
                high=mid-1;
             }

            }
            return false;

            
         } 
}