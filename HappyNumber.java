class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> checked = new HashSet<>();
        int sum = 0;
        int x = n;
        
        while (true) {
            sum = 0;
            for ( int i=0; i<Integer.toString(x).length(); i++ ) {
                sum += Integer.parseInt(Character.toString(Integer.toString(x).charAt(i))) * Integer.parseInt(Character.toString(Integer.toString(x).charAt(i)));
            }
            
            if (sum == 1) return true;
            else if (checked.contains(sum)) return false;
            else {
                checked.add(x);
                x = sum;
            }
        }
    }
}
