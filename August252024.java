import java.util.ArrayList;
import java.util.List;

public class August252024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> postOrder = new ArrayList<>();
            traverse(postOrder,root);
            return postOrder;
        }

        private void traverse(List<Integer> postOrder, TreeNode root){
            if(root==null){
                return;
            }
            traverse(postOrder,root.left);
            traverse(postOrder,root.right);
            postOrder.add(root.val);
        }
    }
}
