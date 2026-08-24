class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int globalmax=nums[0];
        for(int i=1;i<nums.length;i++){
            int val=nums[i];
            if(val<0){
                int temp=currmax;
                currmax=currmin;
                currmin=temp;
            }
            currmax=Math.max(val,currmax*val);
            currmin=Math.min(val,currmin*val);

            globalmax=Math.max(currmax,globalmax);
        }
        return globalmax;
    
    }
}
