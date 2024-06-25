import java.util.Stack;

public class June252024 {
    public static void main(String[] args) {

    }
    class Solution {
        public TreeNode bstToGst(TreeNode root) {
            Stack<TreeNode> reversePreorder = new Stack<>();
            getReversePreorder(root,reversePreorder);
            int currSum = 0;
            while(!reversePreorder.isEmpty()){
                TreeNode curr = reversePreorder.pop();
                curr.val += currSum;
                currSum = curr.val;
            }
            return root;
        }

        void getReversePreorder(TreeNode root, Stack<TreeNode> reversePreorder){
            if(root==null){
                return;
            }
            getReversePreorder(root.left,reversePreorder);
            reversePreorder.push(root);
            getReversePreorder(root.right,reversePreorder);
        }
    }
}
