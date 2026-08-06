class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            if(c=='['){
                st.push(']');
            }if(c=='{'){
                st.push('}');
            }
            if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()){
                    return false;
                }
                char top =st.pop();
                if(top!=c){
                    return false;
                }
            }
           
           }
           return st.isEmpty();
    }
}