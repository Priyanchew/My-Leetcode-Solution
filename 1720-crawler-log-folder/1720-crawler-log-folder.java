class Solution {
    public int minOperations(String[] logs) {
        int where = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(where==0){
                    continue;
                }
                else{
                    where--;
                }
            }else if(logs[i].equals("./")){
                continue;
            }
            else{
                where++;
            }
        }
        return where;
    }
}