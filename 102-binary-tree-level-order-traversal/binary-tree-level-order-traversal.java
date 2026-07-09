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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
       Queue<TreeNode> input = new LinkedList<>();
        if(root==null)return ans;
        input.add(root);
        while(!input.isEmpty()){
            int size=input.size();
            List<Integer>level=new ArrayList<>();

            for(int i=0;i<size;i++){

           
           TreeNode root1=input.poll();
         level.add(root1.val);
         if(root1.left!=null){
            input.add(root1.left);
         }

         if(root1.right!=null){
            input.add(root1.right);
         }

            }
             ans.add(level);
         


        }
          return ans;

        
        
    }
}