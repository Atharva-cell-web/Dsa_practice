class Solution {
    public int removeDuplicates(int[] nums) {
        int ins=0;
        for(int s=0;s<nums.length;s++){
            if(nums[ins]!=nums[s]){
                ins++;
                nums[ins]=nums[s];
            }
            
        }
        return ins+1;
    }
}