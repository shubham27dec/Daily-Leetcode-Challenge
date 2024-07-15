import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class July152024 {
    public static void main(String[] args) {

    }
    class Solution {
        public TreeNode createBinaryTree(int[][] descriptions) {
            TreeNode parent;
            TreeNode child;
            Map<Integer,TreeNode> nodes = new HashMap<>();
            Set<Integer> children = new HashSet<>();
            for(int[] description : descriptions){
                if(nodes.containsKey(description[0])){
                    parent = nodes.get(description[0]);
                }
                else{
                    parent = new TreeNode(description[0]);
                }
                if(nodes.containsKey(description[1])){
                    child = nodes.get(description[1]);
                }
                else{
                    child = new TreeNode(description[1]);
                }
                if(description[2]==1){
                    parent.left = child;
                }
                else{
                    parent.right = child;
                }
                children.add(child.val);
                nodes.put(parent.val,parent);
                nodes.put(child.val,child);
            }
            for(int node : nodes.keySet()){
                if(!children.contains(node)){
                    return nodes.get(node);
                }
            }
            return new TreeNode(-1);
        }
    }
}
