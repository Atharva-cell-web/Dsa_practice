class Solution {
    public int findMaxLength(int[] nums) {
       int maxlength=0;
       int sum=0;
       HashMap<Integer,Integer> maps =new HashMap<>();
       maps.put(0,-1);
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            sum+=-1;
        }else{
            sum+=1;
        }
        if(maps.containsKey(sum-0)){
            int l=maps.get(sum-0);
            maxlength=Math.max(maxlength,i-l);
        }
        if(!maps.containsKey(sum-0)){
            maps.put(sum,i);
        }

       }
       return maxlength;
       
    }
}