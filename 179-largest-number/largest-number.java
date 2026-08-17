class Solution {
    public String largestNumber(int[] nums) {
        
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(str,(s1,s2)->(s2+s1).compareTo(s1+s2));

        if (str[0].equals("0")) {
            return "0";
        }
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length;i++){
            st.append(str[i]);
        }
        return st.toString();
    }
}
