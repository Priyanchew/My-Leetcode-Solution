class Solution {
    public boolean canBeEqual(int[] targetArray, int[] currentArray) {
       
        int[] elementCounts = new int[1001];
        int uniqueCount = 0;
        
        for (int i = 0; i < targetArray.length; i++) {
            if (elementCounts[targetArray[i]]++ == 0) uniqueCount++;
            if (elementCounts[currentArray[i]]-- == 1) uniqueCount--;
        }
        
        return uniqueCount == 0;
    }
}