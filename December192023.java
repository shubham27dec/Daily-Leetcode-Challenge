public class December192023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] imageSmoother(int[][] img) {
            int rows = img.length, cols = img[0].length;
            int[][] smoothed = new int[rows][cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    smoothed[row][col] = smooth(row,col,rows,cols,img);
                }
            }
            return smoothed;
        }

        int smooth(int row, int col, int rows, int cols, int[][] img){
            int sum = img[row][col];
            int count = 1;
            if(row>0){
                sum += img[row-1][col];
                count++;
                if(col>0){
                    sum += img[row-1][col-1];
                    count++;
                }
                if(col<cols-1){
                    sum += img[row-1][col+1];
                    count++;
                }
            }
            if(col>0){
                sum += img[row][col-1];
                count++;
                if(row<rows-1){
                    sum += img[row+1][col-1];
                    count++;
                }
            }
            if(row<rows-1){
                sum += img[row+1][col];
                count++;
                if(col<cols-1){
                    count++;
                    sum += img[row+1][col+1];
                }
            }
            if(col<cols-1){
                sum += img[row][col+1];
                count++;
            }
            return sum/count;
        }
    }
}
