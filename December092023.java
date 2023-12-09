import java.util.ArrayList;
import java.util.List;

public class December092023 {
    public static void main(String[] args) {
    }
    class Solution {
        List<Integer> inOrder = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            inOrder(root);
            return inOrder;
        }

        void inOrder(TreeNode root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            inOrder.add(root.val);
            inOrder(root.right);
        }
    }
}
