import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class February282024 {
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
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            List<List<Integer>> levels = new ArrayList<>();
            while(!q.isEmpty()){
                int levelSize = q.size();
                List<Integer> level = new ArrayList<>();
                while(levelSize-->0){
                    TreeNode node = q.poll();
                    if(node.left != null){
                        q.offer(node.left);
                    }
                    if(node.right != null){
                        q.offer(node.right);
                    }
                    level.add(node.val);
                }
                levels.add(0,level);
            }
            return levels.get(0).get(0);
        }
    }
}
