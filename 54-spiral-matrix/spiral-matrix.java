class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows =matrix.length;
        int cols=matrix[0].length;
        List<Integer> lst=new ArrayList<>();
        int top=0;
        int left=0;
        int right=cols-1;
        int bottom=rows-1;
        while( top<=bottom && left<=right ){
            for(int i=left;i<=right;i++){
                lst.add(matrix[top][i]);
            }
            top++;
            if(top<=bottom && left<=right){
            for(int j=top;j<=bottom;j++){
                lst.add(matrix[j][right]);
            }
            right--;
            }

            if(top<=bottom && left<=right){
            for(int i=right;i>=left;i--){
                lst.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(top<=bottom && left<=right){
            for(int j=bottom;j>=top;j--){
                lst.add(matrix[j][left]);
            }
            left++;
            }
        }
        return lst;
    }
}