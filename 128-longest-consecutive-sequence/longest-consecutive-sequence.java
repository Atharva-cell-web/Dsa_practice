class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0){
        return 0;
       }
       HashSet<Integer> sets=new HashSet<>();
       for(int i=0;i<nums.length;i++){
            sets.add(nums[i]);
       }
       int maxcount=0;
       for(int e:sets){
        int count=0;
          if(!sets.contains(e-1)){
            while(sets.contains(e)){
                count++;
                e=e+1;
            }
          }
          maxcount=Math.max(maxcount,count);
       }
       return maxcount;
       
    }
}