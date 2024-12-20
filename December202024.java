import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class December202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public TreeNode reverseOddLevels(TreeNode root) {
            List<List<TreeNode>> levels = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            boolean oddLevel = false;
            q.offer(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<TreeNode> level = new ArrayList<>();
                while(size-->0){
                    TreeNode node = q.poll();
                    if(node.left!=null){
                        q.offer(node.left);
                    }
                    if(node.right!=null){
                        q.offer(node.right);
                    }
                    level.add(node);
                }
                if(oddLevel){
                    for(int i=0; i<level.size()/2; i++){
                        int temp = level.get(i).val;
                        level.get(i).val = level.get(level.size()-1-i).val;
                        level.get(level.size()-1-i).val = temp;
                    }
                    oddLevel = false;
                }
                else{
                    oddLevel = true;
                }
                levels.add(level);
            }
            return root;
        }
    }
}
