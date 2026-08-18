class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentsum=0;
        double maxsum=0;
        for(int r=0;r<k;r++){
            currentsum+=nums[r];
        }
        maxsum=currentsum;
        for(int r=k;r<nums.length;r++){
            currentsum+=nums[r]-nums[r-k];
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum/k;
    }
}