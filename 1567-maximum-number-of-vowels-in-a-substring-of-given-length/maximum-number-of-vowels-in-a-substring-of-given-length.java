class Solution {
    public int maxVowels(String s, int k) {
        int max1=0;
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(vowel(ch)){
                count++;
            }

        }
        max1=Math.max(max1,count);
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i-k);
            if(vowel(ch)){
                count++;
            }
            if(vowel(ch2)){
                count--;
            }
            max1=Math.max(max1,count);

        }
        return max1;
       
        
        
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}