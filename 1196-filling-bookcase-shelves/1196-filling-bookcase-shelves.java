class Solution {
    Integer[][] memo;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        memo = new Integer[n][shelfWidth+1];
        return solve(books, shelfWidth, 0, 0, 0);
    }

    public int solve(int[][] books, int shelfWidth, int width, int ind, int maxHeight) {
        if(ind == books.length) return 0;
        if(memo[ind][width] != null) return memo[ind][width];
        int addToNewRack = books[ind][1] + solve(books, shelfWidth, books[ind][0], ind+1, books[ind][1]);
        int addToExistingRack = Integer.MAX_VALUE;
        if(shelfWidth >= width + books[ind][0])
            addToExistingRack = Math.max(books[ind][1] - maxHeight, 0) + solve(books, shelfWidth, width + books[ind][0], ind+1, Math.max(maxHeight, books[ind][1]));
        return memo[ind][width] = Math.min(addToNewRack, addToExistingRack);
    }
}