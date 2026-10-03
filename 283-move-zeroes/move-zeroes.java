class Solution {
    public void moveZeroes(int[] nums) {
       
    //    int i=0;
    //    for(int j=0;j<arr.length;j++){
    //         if(arr[j]!=0){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             i++;
    //         }
    //    }
    
    int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[j]!=0 && nums.length>1){
            j++;
        }
        if(j<nums.length-1 && nums[j]==0 && nums[i]!=0 && j<i){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
        }
    }
    
    }
}