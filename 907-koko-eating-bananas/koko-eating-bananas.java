class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=0;
        for(int si:piles){
            maxspeed=Math.max(si,maxspeed);
        }
        while(minspeed<=maxspeed){
            int mid=minspeed +(maxspeed-minspeed)/2;
            if(caneattime(piles,h,mid)){
                maxspeed=mid -1;
            }
            else{
                minspeed=mid+1;
            }


        }
        return minspeed;

        
    }
    public boolean caneattime(int []piles,int h,int speed){
        long hours=0;
        for(int pil:piles){
            hours+=(int)Math.ceil((double) pil/speed);
        }
        return hours<=h;
    } 
}