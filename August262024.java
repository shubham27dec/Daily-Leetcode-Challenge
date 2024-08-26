import java.util.ArrayList;
import java.util.List;

public class August262024 {
    public static void main(String[] args) {

    }
    class Solution {
        List<Integer> ans=new ArrayList<>();
        public List<Integer> postorder(Node1 root) {
            if(root==null) return ans;
            for(Node1 n: root.children){
                postorder(n);
            }
            ans.add(root.val);
            return ans;
        }
    }
}
