class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxcount=0;
        HashSet<Integer> sets=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sets.add(nums[i]);
        }
        for(int num:sets){
            if(!sets.contains(num-1)){
                int count =0;
                int n=num;
                while(sets.contains(n)){
                    count++;
                    n++;
                }
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
}