public class May162024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean evaluateTree(TreeNode root) {
            if(root.val==0 || root.val==1){
                return root.val==1;
            }
            if(root.val==2){
                return evaluateTree(root.left) || evaluateTree(root.right);
            }
            if(root.val==3){
                return evaluateTree(root.left) && evaluateTree(root.right);
            }
            return false;
        }
    }
}
