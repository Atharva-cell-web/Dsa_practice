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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        Queue<TreeNode > qu=new LinkedList<>();
        if(root==null){
            return lst;
        }
        qu.offer(root);
        TreeNode lastseen=root;
       
        
        while(!qu.isEmpty()){
            int levelsize=qu.size();
            for(int i=0;i<levelsize;i++){
                TreeNode currNode=qu.poll();
                lastseen=currNode;

                if(currNode.left!=null){
                    qu.offer(currNode.left);
                }
                if(currNode.right!=null){
                    qu.offer(currNode.right);
                }
            }
            lst.add(lastseen.val);

        }
        return lst;

    }
}