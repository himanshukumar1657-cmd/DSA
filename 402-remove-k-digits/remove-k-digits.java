class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i= 0; i<num.length(); i++) {
            char ch=num.charAt(i);

            while(!stack.isEmpty()&&k>0 && stack.peek()>ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        
        char[] res=new char[stack.size()];
        int i=res.length - 1;

        while (i>=0) {
            res[i]=stack.pop();
            i--;
        }
        i=0;
        while (i <res.length && res[i]=='0') {
            i++;
        }

        StringBuilder res2=new StringBuilder();

        while (i <res.length) {
            res2.append(res[i]);
            i++;
        }

        return res2.length()==0 ? "0" : res2.toString();
    }
}