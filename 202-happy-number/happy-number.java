class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> in=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            if(sum==1) return true;
            n=sum;
            if(in.contains(n)){
               return false;
            }
            in.add(n);
        }
        
        
    }
}