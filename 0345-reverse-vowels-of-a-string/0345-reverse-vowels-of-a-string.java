class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    
    void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
    
    public String reverseVowels(String s) {
        int start = 0;
        int end  = s.length() - 1;
        char[] sChar = s.toCharArray();
        
        while (start < end) {
            while (start < s.length () && !isVowel(sChar[start])) {
                start++;
            }
            while (end >= 0 && !isVowel(sChar[end])) {
                end--;
            }
            if (start < end) {
                swap(sChar, start++, end--);
            }
        }
        
        return new String(sChar);
    }
};