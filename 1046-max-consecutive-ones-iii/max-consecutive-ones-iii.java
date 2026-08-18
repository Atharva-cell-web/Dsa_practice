class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int maxLength=Integer.MIN_VALUE;
        int n=0;
        
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                n++;
            }
                
            while( n>k ){
                if(nums[left]==0){
                    n--;
                }
                left++;
            }
            maxLength=Math.max(maxLength,r-left+1);
            
        }
        return maxLength;
    }
}
