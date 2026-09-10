class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] matrixn=new int[cols][rows];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                matrixn[col][row]=matrix[row][col];
                
            }
            
        }
        return matrixn;
    }
}