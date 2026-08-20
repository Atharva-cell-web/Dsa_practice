class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        maps.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int see=prefixsum-k;

            if(maps.containsKey(see)){
                count+=maps.get(see);
            }
            maps.put(prefixsum,maps.getOrDefault(prefixsum,0)+1);
        }

        return count;
    }
}
