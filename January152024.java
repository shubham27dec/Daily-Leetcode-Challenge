import java.util.*;

public class January152024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            List<List<Integer>> winners = new ArrayList<>();
            winners.add(new ArrayList<>());
            winners.add(new ArrayList<>());
            Map<Integer,Integer> lossFreq = new HashMap<>();
            for(int[] match : matches){
                int winner = match[0];
                int loser = match[1];
                lossFreq.put(winner,lossFreq.getOrDefault(winner,0));
                lossFreq.put(loser,lossFreq.getOrDefault(loser,0)+1);
            }
            for(int team : lossFreq.keySet()){
                if(lossFreq.get(team)==0){
                    winners.get(0).add(team);
                }
                if(lossFreq.get(team)==1){
                    winners.get(1).add(team);
                }
            }
            Collections.sort(winners.get(0));
            Collections.sort(winners.get(1));
            return winners;
        }
    }
}
