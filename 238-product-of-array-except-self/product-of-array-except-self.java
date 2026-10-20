class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix1=new int[n];
        int[] prefix2=new int[n];
        prefix1[0]=1;
        prefix2[n-1]=1;
        for(int i=1;i<nums.length;i++){
            prefix1[i]=prefix1[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            prefix2[i]=prefix2[i+1]*nums[i+1];
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=prefix1[i]*prefix2[i];
        }

        return result;
    }
    
}
