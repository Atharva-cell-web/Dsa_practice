class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st =new Stack<>();
        int[] result =new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.empty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            result[i]=st.isEmpty()?0:st.peek()-i;

            st.push(i);
        }
        return result;

    }
}








































/*int n=nums.length;
      Stack<Integer> s1=new Stack<>();
      int[] result=new int[n];

      for(int i=n-1;i>=0;i--){
        if(s1.isEmpty()){
            result[i]=0;
            s1.push(i);

            continue;
        }

        while(!s1.isEmpty() && nums[s1.peek()]<=nums[i]){
            s1.pop();
        }
        if(s1.isEmpty()){
            result[i]=0;
            s1.push(i);
        }else{
            result[i]=s1.peek()-i;
            s1.push(i);
        }
        
      } 
      return result;*/
    