class Solution {
    public int minSteps(int targetCount) {
        if (targetCount == 1) return 0;
        int[] minOperations = new int[targetCount + 1];
        Arrays.fill(minOperations, Integer.MAX_VALUE);
        minOperations[1] = 0;
        
        for (int currentCount = 2; currentCount <= targetCount; currentCount++) {
            for (int factor = 1; factor * factor <= currentCount; factor++) {
                if (currentCount % factor == 0) {
                    minOperations[currentCount] = Math.min(minOperations[currentCount], 
                                                           minOperations[factor] + currentCount / factor);
                    if (factor != currentCount / factor) {
                        minOperations[currentCount] = Math.min(minOperations[currentCount], 
                                                               minOperations[currentCount / factor] + factor);
                    }
                }
            }
        }
        
        return minOperations[targetCount];
    }
}