class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int Maxarea=0;
        while(left<right){
            int minh=Math.min(height[left],height[right]);
            int area=minh*(right-left);
            Maxarea=Math.max(Maxarea,area);
            if(height[left]<height[right]){
                left++;
            }else if(height[right]<height[left]){
                right--;
            }else{
                left++;
                right--;
            }

        }
        return Maxarea;
    }
}