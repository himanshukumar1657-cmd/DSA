class Solution {
    public int[] singleNumber(int[] nums) {

        int xor=0;
        for(int num:nums){
            xor^=num;
        }
         int exit=0;
         while(true){
            if((xor & 1)==1){
                break;
               }
                xor>>=1;
                exit++;
         }
         int setbuk=0;
         int unsetbuk=0;
         for(int num:nums){
            if(((num >> exit) & 1)==1){
                setbuk^=num;
            }
            else{
               unsetbuk ^=num; 
            }
         }
         return new int []{setbuk,unsetbuk};
        
    }
}