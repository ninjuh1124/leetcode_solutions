class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] x = new boolean[nums.length];
        
        for (int i : nums) {
            if (x[i]) {
                return i;
            } else x[i] = true;
        }
        
        throw new IllegalArgumentException("you fucked up");
    }
}
