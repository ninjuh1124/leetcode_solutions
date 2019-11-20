class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set;
        int j;
        int count = 0;
        
        for (int i=0; i<s.length(); i++) {
            set = new HashSet<Character>();
            j = i;
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
                j++;
            }
            
            if (set.size() > count) count = set.size();
            if (s.length() - i == set.size()) return count;
        }
        
        return count;
    }
}
