class Solution {
    public int diagonalSum(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==rows-1){
                    sum+=matrix[i][j];
                }

            }

        }
        if(rows%2!=0){
            int row=rows/2;
            int col=cols/2;
            sum=sum-matrix[row][col];
        }
        return sum;
    }
}