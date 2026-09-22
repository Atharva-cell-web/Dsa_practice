class Solution {
    public int missingNumber(int[] nums) {
        int TotalSum=0;
        for(int i=0;i<=nums.length;i++){
            TotalSum+=i;
        }
        int arraySum=0;
        for(int i=0;i<nums.length;i++){
            arraySum+=nums[i];
        }
        return TotalSum-arraySum;
    }
    
}