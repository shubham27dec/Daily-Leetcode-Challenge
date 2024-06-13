import java.util.Arrays;

public class June132024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);
            int moves = 0;
            int n = seats.length;
            for(int i=0; i<n; i++){
                moves += Math.abs(seats[i]-students[i]);
            }
            return moves;
        }
    }
}
