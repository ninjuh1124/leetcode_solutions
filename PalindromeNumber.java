class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int xPrime = x;
        int xInv = 0;

        while (xPrime != 0) {
            xInv = xInv*10 + (xPrime%10);
            xPrime /= 10;
        }
        
        return xInv == x;
    }
}
