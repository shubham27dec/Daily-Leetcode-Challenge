import java.util.*;

public class July172024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            Queue<TreeNode> q = new LinkedList<>();
            Set<Integer> delete = new HashSet<>();
            Set<TreeNode> forest = new HashSet<>();
            for(int ele : to_delete){
                delete.add(ele);
            }
            if(!delete.contains(root.val)){
                forest.add(root);
            }
            else{
                if(root.left!=null){
                    forest.add(root.left);
                }
                if(root.right!=null){
                    forest.add(root.right);
                }
            }
            q.offer(root);
            while(!q.isEmpty()){
                root = q.poll();
                if(root.left!=null){
                    q.offer(root.left);
                    if(delete.contains(root.left.val)){
                        forest.remove(root.left);
                        if(root.left.left!=null){
                            forest.add(root.left.left);
                        }
                        if(root.left.right!=null){
                            forest.add(root.left.right);
                        }
                        root.left = null;
                    }
                }
                if(root.right!=null){
                    q.offer(root.right);
                    if(delete.contains(root.right.val)){
                        forest.remove(root.right);
                        if(root.right.left!=null){
                            forest.add(root.right.left);
                        }
                        if(root.right.right!=null){
                            forest.add(root.right.right);
                        }
                        root.right = null;
                    }
                }
            }
            return new ArrayList<>(forest);
        }
    }
}
