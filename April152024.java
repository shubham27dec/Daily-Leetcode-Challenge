public class April152024 {
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
        public int sumNumbers(TreeNode root) {
            return solve(0,root);
        }

        int solve(int sum, TreeNode root){
            if(root==null){
                return 0;
            }
            sum = sum*10 + root.val;

            if(root.left==null && root.right==null){
                return sum;
            }

            return solve(sum,root.left) + solve(sum,root.right);
        }
    }
}
