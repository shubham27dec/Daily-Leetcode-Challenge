import java.util.ArrayList;
import java.util.List;

public class January092024 {
    public static void main(String[] args) {

    }
    class Solution {

        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leafSequence1 = new ArrayList<>();
            List<Integer> leafSequence2 = new ArrayList<>();
            addLeafValue(root1,leafSequence1);
            addLeafValue(root2,leafSequence2);
            return leafSequence1.equals(leafSequence2);
        }

        void addLeafValue(TreeNode root, List<Integer> leafSequence){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                leafSequence.add(root.val);
                return;
            }
            addLeafValue(root.left,leafSequence);
            addLeafValue(root.right,leafSequence);
        }
    }
}
