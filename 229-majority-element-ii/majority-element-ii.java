class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:maps.entrySet()){
            if(entry.getValue()>n/3){
                lst.add(entry.getKey());
            }
        }
        return lst;
    }
}