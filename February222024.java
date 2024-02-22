import java.util.HashMap;
import java.util.HashSet;

public class February222024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findJudge(int n, int[][] trust) {
            if(n==1){
                return 1;
            }
            int length = trust.length;
            HashSet<Integer> barredJudgeCandidates = new HashSet<>();
            HashMap<Integer,HashSet<Integer>> judgeCandidates =  new HashMap<>();
            for(int i=0; i<length; i++){
                int trustee = trust[i][1];
                int truster = trust[i][0];
                if(judgeCandidates.containsKey(truster)){
                    judgeCandidates.remove(truster);
                }
                barredJudgeCandidates.add(truster);
                if(!judgeCandidates.containsKey(trustee) && !barredJudgeCandidates.contains(trustee)){
                    judgeCandidates.put(trustee,new HashSet<>());
                }
                if(judgeCandidates.containsKey(trustee)){
                    judgeCandidates.get(trustee).add(truster);
                }
            }
            int judgeCount = 0, judge=0;
            for(int judgeCandidate : judgeCandidates.keySet()){
                if(judgeCandidates.get(judgeCandidate).size()==n-1){
                    judgeCount++;
                    judge = judgeCandidate;
                }
            }
            return judgeCount==1?judge:-1;
        }
    }
}
