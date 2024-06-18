class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0;
        for(int i=0; i<worker.length;i++){
            int maxfori = 0;
            for(int j=0; j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]){
                    if(profit[j]>maxfori){
                    maxfori=profit[j];
                }
                }
            }
            total+=maxfori;
        }
        return total;
    }
}