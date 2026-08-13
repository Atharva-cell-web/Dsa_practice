class Solution {
    public void moveZeroes(int[] arr) {
       
         int insert=0;
         for(int scan=0;scan<arr.length;scan++){
            if(arr[scan]!=0){
                int temp=arr[scan];
                arr[scan]=arr[insert];
                arr[insert]=temp;
                insert++;
            }
         }
    }
}