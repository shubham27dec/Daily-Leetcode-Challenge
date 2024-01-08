public class January082023 {
    public static void main(String[] args) {

    }
    class Solution {
        int sum = 0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            if(root==null){
                return 0;
            }
            if(root.val < low){
                return rangeSumBST(root.right, low, high);
            }
            else if(root.val > high){
                return rangeSumBST(root.left, low, high);
            }
            else{
                return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
            }
        }
    }
}
