class Solution {
    public int singleNonDuplicate(int[] nums) {        
        for (int i=0; i<nums.length; i+=2) {
            if (i+1 == nums.length) return nums[i];
            if (nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
}
