class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer> sets=new HashSet<>();
       int i=0,j=0;
       while(j<nums.length){
        if(j-i<=k){
            if(sets.contains(nums[j])){
                return true;
            }
            sets.add(nums[j]);
            j++;
        }else{
            sets.remove(nums[i]);
            i++;
        }
        
       }
       return false;
    }
}