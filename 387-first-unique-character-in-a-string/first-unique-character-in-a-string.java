class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>in=new HashMap();
        //int fre=0;
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
       int fre = in.getOrDefault(ch, 0);
       in.put(ch,fre+1);


        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          if(in.get(ch)==1){
            return i;
           // break;
          }

        }
        return -1;
        
    }
}