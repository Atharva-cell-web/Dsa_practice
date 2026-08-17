class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       Arrays.sort(arr);

       List<List<Integer>> lst=new ArrayList<>();

       int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
        int diff=Math.abs(arr[i+1]-arr[i]);

        minDiff=Math.min(minDiff,diff);
        }

       for(int i=0;i<arr.length-1;i++){
        int diff=Math.abs(arr[i+1]-arr[i]);

        if(diff==minDiff){
            List<Integer> pair=new ArrayList<>();
            pair.addAll(List.of(arr[i],arr[i+1]));
            lst.add(pair);
        }
       } 
       return lst;
    }
}