class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int maxcap=0;
        for(int i:weights){
            if(max<i){
                max=i;
            }
            maxcap+=i;
        }
        int low=max;
        int high=maxcap;
        
        while(low<high){
            int mid=(low+high)/2;
            int sum=0;
            int day=1;
            for(int j:weights){
                if(j+sum >mid){
                    day++;
                    sum=0;
                }
                sum+=j;
            }
            if(day>days){
                low=mid+1;

            }
            else{
                high=mid;
            }
        }
        return low;
        

        
    }
}