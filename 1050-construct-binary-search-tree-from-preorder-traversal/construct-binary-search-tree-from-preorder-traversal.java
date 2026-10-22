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
    public TreeNode BST_preorder(TreeNode root,int value){
        if(value<root.val){
                if(root.left==null) root.left=new TreeNode(value);
                else BST_preorder(root.left,value);
            }
            else{
                if(root.right==null) root.right=new TreeNode(value);
                else BST_preorder(root.right,value);
            }
            return root;

    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            BST_preorder(root,preorder[i]);
            }
        return root;
        
        
    }
}