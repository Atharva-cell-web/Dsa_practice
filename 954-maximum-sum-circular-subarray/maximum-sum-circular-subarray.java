class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=kadensmax(nums);
        int minsum=kadensmin(nums);
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int circularSum=total-minsum;
        if(maxsum>0){
            return Math.max(maxsum,circularSum);
        }
        return maxsum;
        
    }
    public int kadensmax(int[] nums){
        int currsum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public int kadensmin(int[] nums){
        int currsum=nums[0];
        int minsum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            currsum=Math.min(nums[i],currsum+nums[i]);
            minsum=Math.min(minsum,currsum);
        }
        return minsum;
    }
}
