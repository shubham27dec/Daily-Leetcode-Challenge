import java.util.LinkedList;
import java.util.Queue;

public class April162024 {
    public static void main(String[] args) {

    }
    class Solution {
        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if(depth == 1){
                TreeNode node = new TreeNode(val);
                node.left = root;
                return node;
            }
            int currDepth = 1;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                if(currDepth == depth-1){
                    while(!q.isEmpty()){
                        TreeNode node = q.poll();
                        TreeNode left = new TreeNode(val);
                        if(node.left!=null){
                            left.left = node.left;
                        }
                        node.left = left;
                        TreeNode right = new TreeNode(val);
                        if(node.right!=null){
                            right.right = node.right;
                        }
                        node.right = right;
                    }
                    return root;
                }
                int size = q.size();
                while(size-->0){
                    TreeNode node = q.poll();
                    if(node.left!=null){
                        q.offer(node.left);
                    }
                    if(node.right!=null){
                        q.offer(node.right);
                    }
                }
                currDepth++;
            }
            return root;
        }
    }
}
