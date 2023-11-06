import java.util.PriorityQueue;

public class November062023 {
    public static void main(String[] args) {

    }
    public class SeatManager {
        private int last;
        private PriorityQueue<Integer> pq;

        public SeatManager(int n) {
            this.last = 0;
            this.pq = new PriorityQueue<>();
        }

        public int reserve() {
            if (pq.isEmpty()) {
                return ++last;
            } else {
                return pq.poll();
            }
        }

        public void unreserve(int seatNumber) {
            if (seatNumber == last) {
                --last;
            } else {
                pq.offer(seatNumber);
            }
        }
    }
}
