class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> maps=new HashMap<>();
       int sum=0;
       int maxLength=0;
       maps.put(0,-1);
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            sum+=-1;
        }else{
            sum+=1;
        }
        if(maps.containsKey(sum)){
            maxLength=Math.max(maxLength,i-maps.get(sum));
        }else{
            maps.put(sum,i);
        }
       }
       return maxLength;
    }
}