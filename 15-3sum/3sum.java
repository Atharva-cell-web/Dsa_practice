class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                
               
                

                if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> lst=new ArrayList<>();
                    lst.addAll(List.of(nums[i],nums[j],nums[k]));
                    ans.add(lst);
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }

                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;

    }
}