import java.util.LinkedList;
import java.util.Queue;

public class February292024 {
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
        public boolean isEvenOddTree(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int levelIndex = 0;
            while(!q.isEmpty()){
                int levelSize = q.size();
                int prevValue = 0;
                if(levelIndex%2==0){
                    prevValue = 0;
                    while(levelSize-->0){
                        TreeNode node = q.poll();
                        if(node.val % 2 ==0 || node.val<=prevValue){
                            return false;
                        }
                        prevValue = node.val;
                        if(node.left != null){
                            q.offer(node.left);
                        }
                        if(node.right != null){
                            q.offer(node.right);
                        }
                    }
                }
                else{
                    prevValue = 10000001;
                    while(levelSize-->0){
                        TreeNode node = q.poll();
                        if(node.val % 2 ==1 || node.val>=prevValue){
                            return false;
                        }
                        prevValue = node.val;
                        if(node.left != null){
                            q.offer(node.left);
                        }
                        if(node.right != null){
                            q.offer(node.right);
                        }
                    }
                }
                levelIndex++;
            }
            return true;
        }
    }
}
