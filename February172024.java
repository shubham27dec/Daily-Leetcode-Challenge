import java.util.PriorityQueue;

public class February172024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {

            PriorityQueue<Integer> heightDiffs = new PriorityQueue<>();

            for(int building=0; building<heights.length-1; building++){

                int heightDiff = heights[building+1] - heights[building];

                if(heightDiff >0){

                    if(heightDiffs.size()<ladders){
                        heightDiffs.add(heightDiff);
                    }

                    else{
                        int bricksUsed = heightDiff;

                        if(heightDiffs.size()!=0 && heightDiffs.peek()<heightDiff){
                            bricksUsed = heightDiffs.poll();
                            heightDiffs.add(heightDiff);
                        }

                        bricks -= bricksUsed;
                        if(bricks < 0){
                            return building;
                        }
                    }
                }
            }
            return heights.length - 1;
        }
    }
}
