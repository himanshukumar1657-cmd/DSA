class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int result[][]=new int[r][c];
        if(r*c!=n*m){
            return mat;
        }
        for(int j=0;j<n*m;j++){
            result[j/c][j%c]=mat[j/m][j%m];
        }
        return result;
        
    }
}