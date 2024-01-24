public class January242024 {
    public static void main(String[] args) {

    }
    class Solution {
        int[] valFreq = new int[10];
        int pseudoPalindromicPaths = 0;

        public int pseudoPalindromicPaths (TreeNode root) {
            checkPseudoPalindromicPath(root);
            return pseudoPalindromicPaths;
        }

        private void checkPseudoPalindromicPath(TreeNode node){
            if(node==null){
                return;
            }
            int val = node.val;
            valFreq[val]++;
            if(node.left==null && node.right==null){
                int oddFreqCount = 0;
                for(int i=0; i<10; i++){
                    if(valFreq[i]%2==1){
                        oddFreqCount++;
                    }
                }
                if(oddFreqCount<2){
                    pseudoPalindromicPaths++;
                }
            }
            checkPseudoPalindromicPath(node.left);
            checkPseudoPalindromicPath(node.right);
            valFreq[val]--;
        }
    }
}
