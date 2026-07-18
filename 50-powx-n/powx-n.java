class Solution {
    public double myPow1(double x, long n) {
    
     if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return  myPow1(1/x, -n);
        } else if(n%2==0) {
            return  myPow1(x*x,n/2);
        }
        else{
            return x*myPow1(x*x,(n-1)/2);
        }
    }
    

    public double myPow(double x, int n) {
        return myPow1(x,n);
       
}
}