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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode inorderBST(int arr[],int low,int high){
               int mid=(low+high)/2;
               TreeNode root=new TreeNode(arr[mid]);
               if(low>high){
                return null;
               }
               root.left=inorderBST(arr,low,mid-1);
               root.right=inorderBST(arr,mid+1,high);
               return root;
     
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
          n++;
          temp=temp.next;        }
          ListNode temp2=head;
          int arr[]=new int[n];
          int i=0;
          while(temp2!=null){
            arr[i++]=temp2.val;
            temp2=temp2.next;
          }
          return inorderBST(arr,0,n-1);


}
}