class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;
        int first=matrix[0][0];
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                        return false;
                }
            }
        }
        return true;
    }
}