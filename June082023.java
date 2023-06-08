public class June082023 {

    public static void main(String[] args) {

    }

    class Solution {
        public int countNegatives(int[][] grid) {
            int count=0;
            for(int rows=0; rows<grid.length; rows++){
                int start=0, end=grid[rows].length-1;
                int toAdd = 0;
                while(start<=end){
                    int mid = start + (end-start)/2;

                    if(grid[rows][mid]>=0) start=mid+1;
                    else{
                        toAdd = grid[rows].length-mid;
                        end=mid-1;
                    }
                }
                count += toAdd;
                // for(int cols=0; cols<grid[rows].length; cols++){
                //     if(grid[rows][cols]<0) count++;
                // }
            }
            return count;
        }
    }
}
