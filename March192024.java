import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class March192024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int leastInterval(char[] tasks, int n) {
            int[] charFreqs = new int[26];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(char task : tasks){
                charFreqs[task-'A']++;
            }
            int time = 0;
            for(int charFreq : charFreqs){
                if(charFreq>0){
                    pq.offer(charFreq);
                }
            }
            while(!pq.isEmpty()){
                List<Integer> list = new ArrayList<>();
                for(int i=0; i<n+1; i++){
                    if(!pq.isEmpty()){
                        int charFreq = pq.poll();
                        charFreq--;
                        list.add(charFreq);
                    }
                }

                for(int ele: list){
                    if(ele>0){
                        pq.offer(ele);
                    }
                }
                if(pq.isEmpty()){
                    time+= list.size();
                }
                else{
                    time += n+1;
                }
            }
            return time;
        }
    }
}
