import java.util.PriorityQueue;

public class May082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int athletes = score.length;
            String[] relativeRanks = new String[athletes];
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0],b[0]));
            for(int i=0; i<athletes; i++){
                pq.offer(new int[]{score[i],i});
            }
            int count = athletes;
            while(!pq.isEmpty()){
                int index = pq.poll()[1];
                if(count==1){
                    relativeRanks[index] = "Gold Medal";
                }
                else if(count==2){
                    relativeRanks[index] = "Silver Medal";
                }
                else if(count==3){
                    relativeRanks[index] = "Bronze Medal";
                }
                else{
                    relativeRanks[index] = String.valueOf(count);
                }
                count--;
            }
            return relativeRanks;
        }
    }
}
