class Solution {
    boolean odd(int num){
        return num%2==1;
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        int i=2;
        while(i<n){
            if(odd(arr[i-2]) && odd(arr[i-1]) && odd(arr[i])){
                return true;
            }
            i++;
        }
        return false;
    }
}