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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        travel(root,lst);
        return lst;
    }
    public void travel(TreeNode root,List<Integer> lst){
       if(root==null){
        return;
       }
       lst.add(root.val);
       travel(root.left,lst);
       travel(root.right,lst);
    }
}