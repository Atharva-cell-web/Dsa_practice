class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Sgas=0;
        int Scost=0;
        for(int i=0;i<gas.length;i++){
            Sgas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            Scost+=cost[i];
        }
        if(Scost>Sgas){
            return -1;
        }
        int currentgas=0;
        int startindex=0;
        for(int i=0;i<gas.length;i++){
            currentgas+=gas[i]-cost[i];
                if(currentgas<0){
                    startindex=i+1;
                    currentgas=0;
                }
                
        }
        return startindex;
    }

}