import java.util.LinkedList;
import java.util.Queue;

public class April142024 {
    public static void main(String[] args) {

    }
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
        public int sumOfLeftLeaves(TreeNode root) {
            int sum = 0;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                if(node.left!=null){
                    if(node.left.left==null && node.left.right==null){
                        sum += node.left.val;
                    }
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            return sum;
        }
    }
}
