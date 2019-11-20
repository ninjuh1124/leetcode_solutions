class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> used = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if (used.get(target-nums[i]) != null) {
                sol[0] = used.get(target-nums[i]);
                sol[1] = i;
                return sol;
            } else {
                used.put(nums[i], i);
            }
        }
        
        return null;
    }
}
