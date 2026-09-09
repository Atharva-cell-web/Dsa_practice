class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> maps1=new HashMap<>();
         List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            maps1.put(nums1[i],maps1.getOrDefault(nums1[i],0)+1);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(maps1.containsKey(nums2[i])){
                int count=maps1.get(nums2[i]);
                if(count>0){
                    lst.add(nums2[i]);
                    maps1.put(nums2[i],maps1.get(nums2[i])-1);
                }
            }
        }
        int[] result=lst.stream().mapToInt(i->i).toArray();
        return result;
    }
}