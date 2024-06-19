class Solution {
    boolean possible(int bloomDay[],int n, int day,int  m,int k){
        int count = 0;
        int no = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                no += (count / k);
                count = 0;
            }
        }
        no += (count / k);
        return no >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(high+low)/2;
            if(possible(bloomDay, n, mid,  m, k)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}