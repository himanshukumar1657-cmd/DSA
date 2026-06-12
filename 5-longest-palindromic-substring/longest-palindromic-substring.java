class Solution {
  public String longestPalindrome(String s) {
     if (s.length() == 1)
      return s;

    String lonStrs="";
    for (int i=1;i<s.length();i++){

      int low =i;
      int high=i;
      while(s.charAt(low)==s.charAt(high)){
          low--;
          high++;
          if(low==-1  || high==s.length()){
        break;
      }
      
      }
      String str=s.substring(low+1,high);
      if(str.length()>lonStrs.length()){
      lonStrs=str;
      }
      
    
    
    low=i-1;
    high=i;
    while(s.charAt(low)==s.charAt(high)){
        low--;
        high++;
        if(low==- 1 || high==s.length()){
        break;
        }
    }
    
           str=s.substring(low+1,high);
     
    if(str.length()>lonStrs.length()){
      lonStrs=str;
      }
    }
     
      return lonStrs;
}
}