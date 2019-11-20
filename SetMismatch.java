class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] x = new boolean[nums.length + 1];
        int[] sol = new int[2];
        
        for (int i : nums) {
            if (x[i]) sol[0] = i;
            x[i] = true;
        }
        
        for (int i=1; i<x.length+1; i++) {
            if (!x[i]) {
                sol[1] = i;
                break;
            }
        }
        return sol;
    }
}
