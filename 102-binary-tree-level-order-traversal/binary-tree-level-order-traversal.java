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
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        if(root==null){
            return result;
        }
        while(!qu.isEmpty()){
            int levelsize=qu.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currNode=qu.poll();
                temp.add(currNode.val);
                
                if(currNode.left!=null){
                    qu.offer(currNode.left);
                }
                if(currNode.right!=null){
                    qu.offer(currNode.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}