class Solution {
    public int subtractProductAndSum(int n) {
        
       int prod = 1 , sum = 0;
        while (n > 0) {

            prod = prod * (n % 10);

            sum = sum + (n % 10);

            // Removing the last digit
            n = n / 10;

        }
        
        return prod-sum;
    }
}