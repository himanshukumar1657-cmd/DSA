class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        
        String[] kp = {
        "",     
        "",     
        "abc", 
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };
    letterCombinations1( digits,kp, ans,"");
    return ans;

        }
        public void letterCombinations1(String digit,String []kp,List<String> ans,String s){
            if(digit.length()==0){
                ans.add(s);
                return;
            }
            int ch=digit.charAt(0)-'0';
            String sh=kp[ch];
            for(int i=0;i<sh.length();i++){
              letterCombinations1( digit.substring(1), kp, ans, s+sh.charAt(i));
            }

        }
        

        
    }

