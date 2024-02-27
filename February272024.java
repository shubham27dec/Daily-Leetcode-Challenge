public class February272024 {
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
        int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            maxHeightOfBinaryTree(root);
            return diameter;
        }

        private int maxHeightOfBinaryTree(TreeNode node){
            if(node==null){
                return 0;
            }
            int left = 1 + maxHeightOfBinaryTree(node.left);
            int right = 1 + maxHeightOfBinaryTree(node.right);
            diameter = Math.max(diameter,left+right-2);
            return Math.max(left,right);
        }
    }
}
