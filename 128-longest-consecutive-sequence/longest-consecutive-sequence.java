class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        HashSet<Integer> sets=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            sets.add(nums[i]);
        }
        int maxcount=0;
        for(int elm:sets){
            int count=0;
            if(!sets.contains(elm-1)){
                int num=elm;
                while(sets.contains(num)){
                    count++;
                    num=num+1;
                }
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}