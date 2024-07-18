import java.util.*;

public class July182024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countPairs(TreeNode root, int distance) {
            Map<TreeNode,List<TreeNode>> graph = new HashMap<>();
            Set<TreeNode> leafNodes = new HashSet<>();
            getGraph(root,null,graph,leafNodes);
            int pairs = 0;
            for(TreeNode leafNode : leafNodes){
                int currDistance = 0;
                Queue<TreeNode> q = new LinkedList<>();
                Set<TreeNode> visited = new HashSet<>();
                visited.add(leafNode);
                q.offer(leafNode);
                while(!q.isEmpty() && currDistance<distance){
                    int size = q.size();
                    for(int i=0; i<size; i++){
                        TreeNode node = q.poll();
                        for(TreeNode neighbour : graph.get(node)){
                            if(!visited.contains(neighbour)){
                                if(leafNodes.contains(neighbour)){
                                    pairs++;
                                }
                                q.offer(neighbour);
                                visited.add(neighbour);
                            }
                        }
                    }
                    currDistance++;
                }
            }
            return pairs/2;
        }

        private void getGraph(TreeNode root, TreeNode prev, Map<TreeNode,List<TreeNode>> graph, Set<TreeNode> leafNodes){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                leafNodes.add(root);
            }
            graph.put(root,new ArrayList<>());
            if(prev!=null){
                graph.get(root).add(prev);
            }
            if(root.left!=null){
                graph.get(root).add(root.left);
            }
            if(root.right!=null){
                graph.get(root).add(root.right);
            }
            getGraph(root.left,root,graph,leafNodes);
            getGraph(root.right,root,graph,leafNodes);
        }
    }
}
