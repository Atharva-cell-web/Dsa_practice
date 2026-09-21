class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //clean the array 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n || nums[i]<=0 ){
                nums[i]=nums.length+1;
            }
        }

        //check the presence
        for(int i=0;i<nums.length;i++){
            int num =Math.abs(nums[i]);
            if(num>n) continue;

            if(nums[num-1]>0){
                nums[num-1]=-nums[num-1];
            }
        }
        //find the first missig 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        //if array is 1 2 3 so foirst missing is 4
        return nums.length +1;
    }
}