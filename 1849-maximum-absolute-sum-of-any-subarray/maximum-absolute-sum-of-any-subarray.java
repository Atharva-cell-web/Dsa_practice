class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int currmax=nums[0];
       int   currmin=nums[0];
       int globalmax=nums[0];
       int globalmin=nums[0];

       for(int i=1;i<nums.length;i++){
         currmax=Math.max(nums[i],currmax+nums[i]);
         globalmax=Math.max(currmax,globalmax);

         currmin=Math.min(nums[i],currmin+nums[i]);
         globalmin=Math.min(currmin,globalmin);
       }
       return Math.max(Math.abs(globalmax),Math.abs(globalmin));
    }
}