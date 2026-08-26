class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
           if(cheak_palindrom(s.substring(i,j))==true){
            count++;
           }
            }
        }
        return count;
        
    }
    public boolean cheak_palindrom(String str){
        int count=0;
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            count++;
            low++;
            high--;
        }
        return true;
    }
}