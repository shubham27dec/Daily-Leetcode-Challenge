import java.util.ArrayList;
import java.util.List;

public class June262024 {
    public static void main(String[] args) {

    }
    class Solution {
        public TreeNode balanceBST(TreeNode root) {
            List<Integer> inorder = new ArrayList<>();
            inorder(root,inorder);
            return balanceBST(inorder,0,inorder.size()-1);
        }

        void inorder(TreeNode root, List<Integer> inorder){
            if(root==null){
                return;
            }
            inorder(root.left,inorder);
            inorder.add(root.val);
            inorder(root.right,inorder);
        }

        TreeNode balanceBST(List<Integer> inorder, int low, int high){
            if(low>high){
                return null;
            }
            int mid = low + (high-low)/2;
            TreeNode root = new TreeNode(inorder.get(mid));
            root.left = balanceBST(inorder,low,mid-1);
            root.right = balanceBST(inorder,mid+1,high);
            return root;
        }
    }
}
