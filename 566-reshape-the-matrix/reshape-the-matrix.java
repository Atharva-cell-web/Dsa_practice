class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int cols=mat[0].length;

        if(rows*cols!=r*c){
            return mat;
        }
        int[][] newmat=new int[r][c];
        int newr=0;
        int newc=0;
        int oldr=0;
        int oldc=0;
       while(oldr<rows){
               newmat[newr][newc]=mat[oldr][oldc];
               oldc++;
               if(oldc==cols){
                oldr++;
                oldc=0;
               } 
               newc++;
               if(newc==c){
                newr++;
                newc=0;
               }

       }
        return newmat;
    }
}