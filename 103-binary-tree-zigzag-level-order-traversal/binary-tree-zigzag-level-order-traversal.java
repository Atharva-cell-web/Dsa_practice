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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        boolean reverse=false;
        
        if(root==null){
            return result;
        }
        qu.offer(root);
        while(!qu.isEmpty()){
            int levelsize=qu.size();
            LinkedList<Integer> lst=new LinkedList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currNode =qu.poll();
                if(currNode.left!=null){
                    qu.offer(currNode.left);
                }
                if(currNode.right!=null){
                    qu.offer(currNode.right);
                }
                if(reverse){
                    lst.addFirst(currNode.val);
                }else{
                    lst.addLast(currNode.val);
                }

            }
            result.add(lst);
            reverse=!reverse;
            
        }
        return result;

    }
}