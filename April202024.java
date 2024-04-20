import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class April202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] findFarmland(int[][] land) {
            List<List<Integer>> temp = new ArrayList<>();
            int rows = land.length;
            int cols = land[0].length;
            boolean[][] visited = new boolean[rows][cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(land[row][col]==1 && !visited[row][col]){
                        int r = row;
                        int c = col;
                        while(r<rows && land[r][col]==1){
                            r++;
                        }
                        while(c<cols && land[row][c]==1){
                            c++;
                        }
                        temp.add(new ArrayList<>(Arrays.asList(row,col,r-1,c-1)));
                        for(int i=row; i<r; i++){
                            for(int j=col; j<c; j++){
                                visited[i][j] = true;
                            }
                        }
                        col=c;
                    }
                }
            }
            if(temp.isEmpty()){
                return new int[][]{};
            }
            int[][] answer = new int[temp.size()][4];
            for(int i=0; i<temp.size(); i++){
                for(int j=0; j<4; j++){
                    answer[i][j] = temp.get(i).get(j);
                }
            }
            return answer;
        }
    }
}
