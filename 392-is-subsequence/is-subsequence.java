class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0;
    int j=0;
    

    while(i<s.length() && j<t.length()){
        char c=s.charAt(i);
        char c2=t.charAt(j);
        if(c==c2){
            i++;
        }
        j++;
    }
    if(i==s.length()){
        return true;
    }else{
        return false;
    }
    }
}