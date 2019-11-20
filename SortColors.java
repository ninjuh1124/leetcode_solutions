class Solution {
    public void sortColors(int[] nums) {
        int[] color = new int[3];   // # of each color { red, white, blue }
        for (int i=0; i< nums.length; i++) color[nums[i]]++;
        
        int pos = 0;
        
        // fill colors
        for(int i=0; i<3; i++) {
            while(color[i] != 0) {
                nums[pos++] = i;
                color[i]--;
            }
        }
    }
}
