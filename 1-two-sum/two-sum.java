class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> maps=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int need=target-nums[i];
        if(maps.containsKey(need)){
            return new int[]{maps.get(need),i};
        }
        maps.put(nums[i],i);
       }
       
        return new int[0];
    }
}