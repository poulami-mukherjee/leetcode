class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0, rev = 0, n = x;
        while(n > 0) {
            rem = n % 10; 
            n = n/10;
            rev = rev * 10 + rem;
        }
        if (rev == x)  {
            return true;
        }
        return false;
    }
}