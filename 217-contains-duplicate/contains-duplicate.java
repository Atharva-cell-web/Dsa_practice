class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(maps.get(nums[i])>=2){
                return true;
            }
        }
        return false;
    }
}