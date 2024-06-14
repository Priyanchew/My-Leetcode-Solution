class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int i = 0;
        int count=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1] || nums[i]>nums[i+1]){
                nums[i+1]++;
                count++;
            }else{
                i++;
            }
        }
        return count;
    }
}