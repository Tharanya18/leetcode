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
    public int minDepth(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if( root == null)
          return 0;
        q.add(root);
        while(!q.isEmpty()){
            count++;
            int s = q.size();
            for( int i = 0 ; i < s ; i++){
                TreeNode cur = q.poll();
                if( cur.left == null && cur.right == null)
                  return count;
                if (cur.left !=  null){
                  q.add(cur.left);
                }
                if( cur.right != null)
                  q.add(cur.right);
            }
        }
        return count;

    }
}