class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        int count=0;
        int runsum=0;
        maps.put(0,1);
        for(int i=0;i<nums.length;i++){
            runsum=runsum+nums[i];
            int rem=(runsum%k+k)%k;
            if(maps.containsKey(rem)){
                count+=maps.get(rem);
            }
            maps.put(rem,maps.getOrDefault(rem,0)+1);
        }
        return count;
    }
}