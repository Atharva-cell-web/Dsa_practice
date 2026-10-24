class Solution {

    public int maxSubArray(int[] arr) {
        int maxsum=arr[0];
        int current=0;
        for(int i=0;i<arr.length;i++){
            current=Math.max(current+arr[i],arr[i]);
            maxsum=Math.max(maxsum,current);
        }
        return maxsum;

    
    }
}