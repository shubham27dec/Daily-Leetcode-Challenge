public class July272024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
            long[][] minCosts = minimumCost(original,changed,cost);
            long miniCost = 0;
            int n = source.length();
            for(int i=0; i<n; i++){
                if(source.charAt(i)!=target.charAt(i)){
                    if(minCosts[source.charAt(i)-'a'][target.charAt(i)-'a']==Integer.MAX_VALUE){
                        return -1;
                    }
                    miniCost += minCosts[source.charAt(i)-'a'][target.charAt(i)-'a'];
                }
            }
            return miniCost;
        }

        private long[][] minimumCost(char[] original, char[] changed, int[] cost){

            long[][] minCosts= new long[26][26];

            for(long[] minCost : minCosts){
                Arrays.fill(minCost,Integer.MAX_VALUE);
            }

            for(int i=0; i<original.length; i++){
                int src = original[i]-'a';
                int nb = changed[i]-'a';
                minCosts[src][nb] = Math.min(minCosts[src][nb],cost[i]);
            }

            for(int via=0; via<26; via++){
                for(int src=0; src<26; src++){
                    for(int nb=0; nb<26; nb++){
                        minCosts[src][nb] = Math.min(minCosts[src][nb],minCosts[src][via] + minCosts[via][nb]);
                    }
                }
            }

            return minCosts;
        }

    }
}
