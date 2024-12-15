import java.util.PriorityQueue;

public class December152024 {
    public static void main(String[] args) {

    }
    class Solution {

        public double maxAverageRatio(int[][] classes, int extraStudents) {
            PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) ->
                    Double.compare(b[0], a[0])
            );

            // Initialize the heap with gain, pass, and total
            for (int[] subject : classes) {
                int pass = subject[0];
                int total = subject[1];
                double gain = (pass + 1.0) / (total + 1.0) - (pass * 1.0 / total);
                maxHeap.offer(new double[]{gain, pass, total});
            }

            // Distribute extra students
            while (extraStudents-- > 0) {
                double[] top = maxHeap.poll();
                int pass = (int) top[1];
                int total = (int) top[2];
                pass++;
                total++;
                double gain = (pass + 1.0) / (total + 1.0) - (pass * 1.0 / total);
                maxHeap.offer(new double[]{gain, pass, total});
            }

            // Calculate the final average ratio
            double totalRatio = 0.0;
            while (!maxHeap.isEmpty()) {
                double[] top = maxHeap.poll();
                int pass = (int) top[1];
                int total = (int) top[2];
                totalRatio += (pass * 1.0 / total);
            }

            return totalRatio / classes.length;
        }
    }
}
