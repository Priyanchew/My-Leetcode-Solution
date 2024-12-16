class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for (int i=0; i<k; i++){
            int smallindex = 0;
            for (int j=0; j<n; j++){
                if (nums[j]<nums[smallindex]){
                    smallindex = j; 
                }
            }
            nums[smallindex] = nums[smallindex] * multiplier;
        }
        return nums;
    }
}