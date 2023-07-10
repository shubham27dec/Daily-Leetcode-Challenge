import java.util.LinkedList;
import java.util.Queue;

public class July102023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            // bfs approach to the problem
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            int depth = 1;
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    // take out node from the front
                    TreeNode temp = q.poll();
                    // check if it is leaf
                    if (temp.left == null && temp.right == null) {
                        return depth;
                    }
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
                depth++;
            }
            return depth;
        }
    }
}
