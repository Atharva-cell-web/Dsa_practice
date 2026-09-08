class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {

        List<int[]> lst=new ArrayList<>();
        int Aptr=0;
        int Bptr=0;
        while(Aptr < A.length && Bptr < B.length){

    int start = Math.max(A[Aptr][0], B[Bptr][0]);
    int end = Math.min(A[Aptr][1], B[Bptr][1]);

    if(start <= end){
        lst.add(new int[]{start, end});
    }

    // Move the interval that finishes first
    if(A[Aptr][1] < B[Bptr][1]){
        Aptr++;
    }else{
        Bptr++;
    }
}
        return lst.toArray(new int[lst.size()][]);
    }
}
