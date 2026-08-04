class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> maps=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            maps.put(c,i);
        }
       
        boolean[] visit=new boolean[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            

            if (visit[c - 'a']) {
            continue;
                }
            
            while(sb.length()>0 && sb.charAt(sb.length()-1)>c && maps.get(sb.charAt(sb.length()-1))>i ){

                char ch=sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                visit[ch-'a']=false;
            }
            sb.append(c);
            visit[c-'a']=true;
        }
        return sb.toString();

    }
}