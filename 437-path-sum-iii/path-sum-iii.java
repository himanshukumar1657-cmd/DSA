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
    public int noOfpaths(TreeNode root,long targetSum){
        if(root==null) return 0;
        int count=0;
        if((long)root.val==(long)targetSum) count++;
        return count+noOfpaths(root.left,(long)targetSum-root.val)+noOfpaths(root.right,(long)targetSum-root.val);
    }

    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null) return 0;
        int count=noOfpaths(root,(long)targetSum);
        count+=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return count;
    }
}