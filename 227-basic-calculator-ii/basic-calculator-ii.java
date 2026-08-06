class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int currentNum=0;
        char lastsign='+';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                currentNum=currentNum*10+(c-'0');

            }
            if((!Character.isDigit(c) && c!=' ') || i==s.length()-1){
                if(lastsign=='-'){
                    
                    st.push(-currentNum);
                }
                else if(lastsign=='+'){
                    
                    st.push(currentNum);
                }else if( lastsign=='*'){
                   
                    st.push(st.pop()*currentNum);
                    
                    
                }else if(lastsign=='/'){
                    st.push(st.pop()/currentNum);
                    
                }
                lastsign = c;
                currentNum = 0;
                
            }

        }
        int result=0;
        while(!st.isEmpty()){
            result+=st.pop();
        }
        return result;
    }
}