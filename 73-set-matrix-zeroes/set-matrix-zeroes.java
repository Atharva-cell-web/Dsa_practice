class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();

        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);

                }
            }
        }
        for(int num:rows){
            for(int i=0;i<col;i++){
                matrix[num][i]=0;
            }
        }
        for(int num:cols){
            for(int i=0;i<row;i++){
                matrix[i][num]=0;
            }
        }
    }
}