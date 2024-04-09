import java.util.LinkedList;
import java.util.Queue;

public class April092024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int timeRequiredToBuy(int[] tickets, int k) {
            Queue<Integer> people = new LinkedList<>();
            int time = 0;
            int numPeople = tickets.length;
            for(int person=0; person<numPeople; person++){
                people.offer(person);
            }
            while(!people.isEmpty()){
                int person = people.poll();
                time++;
                tickets[person]--;
                if(tickets[person]!=0){
                    people.offer(person);
                }
                else if(person==k){
                    return time;
                }
            }
            return time;
        }
    }
}
