class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int left=0;
        int count=0;
        
        for(int r=0;r<nums.length;r++){
            prod*=nums[r];

            while(prod>=k && left<=r){
                prod=prod/nums[left];
                left++;
            }
            count+=r-left+1;
        }
        return count;
    }
}