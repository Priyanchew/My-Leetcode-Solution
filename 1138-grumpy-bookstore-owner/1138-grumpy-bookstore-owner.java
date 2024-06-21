class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        if (n == 1) {
            return customers[0];
        }
        int l = 0;
        int r = -1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                sum = sum + customers[i];
            }
        }
        int maxsum = sum;
        while (r < n - 1) {
            r++;
            if (grumpy[r] == 1) {
                sum = sum + customers[r];
            }
            if (r >= minutes) {
                if (grumpy[l] == 1) {
                    sum = sum - customers[l];
                }
                l++;
            }
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}