class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int unmatch=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
            }
            else{
                if(open==0){
                    unmatch++;
                }
                if(open>0){
                    open--;
                }
            }
        }
        return unmatch+open;
    }
}