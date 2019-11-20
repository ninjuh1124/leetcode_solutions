class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<Character>();
        int count = 0;
        
        for (int i=0; i<J.length(); i++) {
            jewels.add(J.charAt(i));
        }
        
        for (int i=0; i<S.length(); i++) {
            if (jewels.contains(S.charAt(i))) count++;
        }
        
        return count;
    }
}
