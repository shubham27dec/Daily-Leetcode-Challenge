import java.util.ArrayList;
import java.util.List;

public class July232023 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<TreeNode> allPossibleFBT(int n) {
            List<TreeNode> res = new ArrayList<>();
            if(n == 0 || n % 2 == 0) return res;
            if(-- n == 0) return List.of(new TreeNode(0));
            for(int i = 1; i < n; i += 2) {
                List<TreeNode> left = allPossibleFBT(i);
                List<TreeNode> right = allPossibleFBT(n - i);
                for(TreeNode l : left) {
                    for(TreeNode r : right) {
                        res.add(new TreeNode(0, l, r));
                    }
                }
            }
            return res;
        }
    }
}
