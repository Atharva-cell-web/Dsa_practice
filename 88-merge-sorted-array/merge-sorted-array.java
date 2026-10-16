class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int thirdp=nums1.length-1;
        m=m-1;
        n=n-1;
       
        while(m>=0 && n>=0){
            if(nums2[n]>nums1[m]){
                nums1[thirdp]=nums2[n];
                n--;
                thirdp--;
            }else{
                nums1[thirdp]=nums1[m];
                m--;
                thirdp--;
            }
        }
        while(m>=0){
            nums1[thirdp--]=nums1[m--];
        }
        while(n>=0){
            nums1[thirdp--]=nums2[n--];
        }
    }
}