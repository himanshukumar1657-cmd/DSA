class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90 ){
                ascii+=32;
                char sb1=(char)ascii;
                sb.setCharAt(i,sb1);

            }
        }
       return sb.toString(); 
    }
}