import java.util.Arrays;

public class January012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int contentChildren = 0;
            int i=g.length-1, j=s.length-1;
            while(i>=0 && j>=0){
                if(s[j]>=g[i]){
                    contentChildren++;
                    j--;
                }
                i--;
            }
            return contentChildren;
        }
    }
}
