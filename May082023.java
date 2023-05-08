public class May082023 {

    public static void main(String[] args) {


    }

    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int rows=0; rows<mat.length; rows++){
            for(int columns=0; columns<mat[rows].length; columns++){
                if(rows == columns || rows == (mat.length-columns-1) || columns == (mat.length-rows-1)) {
                    sum+= mat[rows][columns];
                }
            }
        }
        //if(mat.length%2!=0) sum-= mat[mat.length/2][mat.length/2];
        return sum;
    }

}
