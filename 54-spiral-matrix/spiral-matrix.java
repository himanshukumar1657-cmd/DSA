class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int columnbegin=0;
        int columnend=matrix[0].length-1;
        int rowbegin=0;
        int rowend=matrix.length-1;
        List<Integer> list = new ArrayList<>();
        while(columnbegin <=columnend && rowbegin <=rowend){
            for(int i=columnbegin;i<=columnend;i++){
                list.add(matrix[rowbegin][i]);
            }
             rowbegin++;
            
            for(int j=rowbegin;j<=rowend;j++){
                list.add(matrix[j][columnend]);
            }
                columnend--;
            
             if(rowbegin <= rowend) {
                 for(int k= columnend;k>=columnbegin;k--){
                list.add(matrix[rowend][k]);
                 }
                rowend--;
            
            }
            if(columnbegin<=columnend){

            
            for(int l=rowend;l>=rowbegin;l--){
                list.add(matrix[l][columnbegin]);
            }
            columnbegin++;
            }
        }
   return list;     
    }
}