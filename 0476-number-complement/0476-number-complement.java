class Solution {
    public int findComplement(int num) 
    {
        int n = (int)(Math.pow(2, digits(num)) - 1); 
        return n - num;                              
    }
    
    public static int digits(int n)
    {
        int c = 0;                  
        while(n > 0)                
        {
            n = n / 2;              //n = 5/2 = 2, 2)2/2 = 1, 3)1/2 = 0
            c++;                    //c = 1, 2, 3
        }
        return c;                   //return 3
    }
}