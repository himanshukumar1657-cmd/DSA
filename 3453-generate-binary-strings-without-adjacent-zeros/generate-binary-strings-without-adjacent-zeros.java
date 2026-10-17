class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, "", ans);
        return ans;
    }
    public void generate(int n,String str, List<String>ans){
        if(str.length()==n){
            ans.add(str);
            return;
        }

        generate(n,str+"1",ans);
        if(str.length()==0 || str.charAt(str.length()-1)!='0'){
           generate(n,str+"0",ans); 
        }
    }
}