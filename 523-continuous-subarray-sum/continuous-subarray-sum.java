

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> maps =new HashMap<>();
        maps.put(0,-1);

        int runsum=0;
        for(int i=0;i<nums.length;i++){
            runsum=runsum+nums[i];
            int remainder=runsum%k;

            if(maps.containsKey(remainder)){
                if((i-maps.get(remainder))>=2){
                    return true;
                }
            }else{
                    maps.put(remainder,i);
                }
        }
        return false;
    
       
    }
}
