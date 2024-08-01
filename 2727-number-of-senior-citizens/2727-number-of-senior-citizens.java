class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            char age = details[i].charAt(11);
            char age1 = details[i].charAt(12);
            int num = age - '0';
            num = num*10 + (age1 - '0');
            if(num>60){
                count++;
            }
        }
        return count;
    }
}