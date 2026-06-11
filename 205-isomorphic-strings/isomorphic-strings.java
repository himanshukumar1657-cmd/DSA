class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>in=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char sh=t.charAt(i);
            if(!in.containsKey(ch)){
                if(!in.containsValue(sh)){
                    in.put(ch,sh);
                }
                else{
                return false;
            }
            }
            if(in.get(ch)!=sh){
                return false;
            }
            

        }
        return true; 
        
    }
}