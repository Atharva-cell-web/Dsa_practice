class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int[] arr=new int[nums.length];
        int trp=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[l])<Math.abs(nums[r])){
                arr[trp]=nums[r]*nums[r];
                trp--;
                r--;
            }else{
                arr[trp]=nums[l]*nums[l];
                trp--;
                l++;
            }
        }
        return arr;
    }
}