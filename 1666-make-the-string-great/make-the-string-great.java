class Solution {
    public String makeGood(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean up=Character.isUpperCase(c);
            if(st.length()>0){
                if(up){
                    char low=Character.toLowerCase(c);
                    if(low==st.charAt(st.length()-1)){
                        st.deleteCharAt(st.length()-1);
                    }else{
                        st.append(c);
                    }
                }else{
                    char upp=Character.toUpperCase(c);
                    if(upp==st.charAt(st.length()-1)){
                        st.deleteCharAt(st.length()-1);
                    }else{
                        st.append(c);
                    }

                }
                    
            }else{
                st.append(c);
            }
            
        }
        return st.toString();
    }
}