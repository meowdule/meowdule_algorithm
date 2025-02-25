class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int two_ab = 2 * a * b;
        
        if (ab >= two_ab) {
            return ab;
        } else {
            return two_ab;
        }
    }
}