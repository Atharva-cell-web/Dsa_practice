class Solution {
    public int totalFruit(int[] fruits) {
      int left=0;
      int maxlength=Integer.MIN_VALUE;
      int count=0;
      HashMap<Integer,Integer> maps=new HashMap<>();
      for(int r=0;r<fruits.length;r++){
       
            maps.put(fruits[r],maps.getOrDefault(fruits[r],0)+1);
        
         
        while(maps.size()>2){
            maps.put(fruits[left],maps.get(fruits[left])-1);
            
            
            if(maps.get(fruits[left])==0){
                maps.remove(fruits[left]);
            }
            left++;
        }
        if(maps.size()<=2){
        maxlength=Math.max(maxlength,r-left+1);
        }
      }
       return maxlength;
    }
}