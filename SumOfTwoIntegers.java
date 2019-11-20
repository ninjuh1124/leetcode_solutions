class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        int aShift, bShift, cShift;
        int c = 0;
        
        for (int i=0; i<32; i++) {
            aShift = (a >> i) & 1;
            bShift = (b >> i) & 1;
            cShift = (aShift ^ bShift) ^ carry;
            
            carry = ((aShift ^ bShift) & carry) | (aShift & bShift);
            
            c = c | (cShift << i);
        }
        
        return c;
    }
}
