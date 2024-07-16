public class July162024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String getDirections(TreeNode root, int startValue, int destValue) {
            StringBuilder directions = new StringBuilder();
            TreeNode lca = getLCA(root,startValue,destValue);
            int sourceToLCA = getEdges(lca,startValue);
            for(int i=0; i<sourceToLCA; i++){
                directions.append('U');
            }
            String[] dir = new String[]{directions.toString()};
            traceLCAToDest(lca,destValue,dir,directions);
            return dir[0];
        }

        private TreeNode getLCA(TreeNode root, int start, int dest){
            if(root==null || root.val==start || root.val==dest){
                return root;
            }
            TreeNode left = getLCA(root.left,start,dest);
            TreeNode right = getLCA(root.right,start,dest);
            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }
            return root;
        }

        private int getEdges(TreeNode lca, int start){
            if(lca==null){
                return 100001;
            }
            if(lca.val==start){
                return 0;
            }
            int left = getEdges(lca.left,start);
            int right = getEdges(lca.right,start);
            return Math.min(left,right) + 1;
        }

        private void traceLCAToDest(TreeNode lca, int dest, String[] dir, StringBuilder directions){
            if(lca==null){
                return;
            }
            if(lca.val==dest){
                dir[0] = directions.toString();
                return;
            }
            directions.append('L');
            traceLCAToDest(lca.left,dest,dir,directions);
            directions.deleteCharAt(directions.length()-1);
            directions.append('R');
            traceLCAToDest(lca.right,dest,dir,directions);
            directions.deleteCharAt(directions.length()-1);
        }
    }
}
