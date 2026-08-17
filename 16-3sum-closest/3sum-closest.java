class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mind=Integer.MAX_VALUE;
        int minsum=0;
      for(int i=0;i<nums.length-1;i++){
        int j=i+1;
        int k=nums.length-1;
        
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(Math.abs(sum-target)<mind){
                mind=Math.abs(sum-target);
                minsum=sum;
            }
            if(sum<target){
                
                j++;
            }else{
               
                k--;
            }

        }
      } 
      return minsum; 
    }
}