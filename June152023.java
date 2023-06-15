import java.util.ArrayDeque;
import java.util.Queue;

public class June152023 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxLevelSum(TreeNode root) {
            int maxSum = Integer.MIN_VALUE;
            int level = 0;

            Queue<TreeNode> qu = new ArrayDeque<>();
            qu.add(root);

            int currLevel = 1;

            while(!qu.isEmpty()){
                int sz = qu.size();
                int sum = 0;

                for(int i = 1; i <= sz; i++){
                    TreeNode node = qu.remove();
                    sum += node.val;

                    if(node.left != null){
                        qu.add(node.left);
                    }

                    if(node.right != null){
                        qu.add(node.right);
                    }
                }
                if(sum > maxSum){
                    maxSum = sum;
                    level = currLevel;
                }
                currLevel++;
            }

            return level;
        }
    }
}
