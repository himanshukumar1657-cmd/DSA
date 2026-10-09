/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       Stack<Integer> st1=new Stack<>();
       Stack<Integer> st2=new Stack<>();
        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        int sum=0;
        ListNode ans=new ListNode(-1);
         ListNode newNode=ans;
        while(!st1.isEmpty() || !st2.isEmpty()){
            if(!st1.isEmpty()) sum+=st1.pop();
            if(!st2.isEmpty()) sum+=st2.pop();
            sum+=carry;
            carry=sum/10;
            ListNode curr=new ListNode(sum%10);
            curr.next = ans.next;
            ans.next = curr;
            sum=0;
            }
            if(carry!=0){
                ListNode curr =new ListNode(carry);
               curr.next = ans.next; 
               ans.next = curr;
            }
            
        return ans.next;
    }
}