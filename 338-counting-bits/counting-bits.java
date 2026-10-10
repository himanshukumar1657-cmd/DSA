class Solution {
    public int solve(int i){
        int count=0;
        while(i>0){
            i=i&(i-1);
            count++;
        }
        return count;

    }
    public int[] countBits(int n) {
        int arr[]=new int [n+1];
        for(int i=0;i<=n;i++){
            arr[i]=solve(i);
        }
        return arr;
    }
}