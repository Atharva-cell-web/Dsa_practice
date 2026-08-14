class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int trp=nums1.length-1;
      int i=m-1;
      int j=n-1;
      while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[trp]=nums1[i];
            trp--;
            i--;
        }else{
            nums1[trp]=nums2[j];
            trp--;
            j--;
        }

      }
      while(i>=0){
        nums1[trp]=nums1[i];
        trp--;
        i--;
      }      
      while(j>=0){
        nums1[trp]=nums2[j];
        trp--;
        j--;
      }
      
      
    }
}