class Solution {
    public boolean isPowerOfThree(int n) {
        boolean isPower = false;
        int num = n;
        
        while (num % 3 == 0 && num > 0) {
            num /= 3;
        }
        
        if (num == 1) {
            isPower = true;
        }
        
        return isPower;
    }
}
