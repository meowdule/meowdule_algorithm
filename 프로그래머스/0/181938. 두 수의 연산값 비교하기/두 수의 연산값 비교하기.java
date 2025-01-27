class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int ab2 = Integer.parseInt(ab);
        int two_ab = 2 * a * b;
        
        if (ab2 >= two_ab) {
            return ab2;
        } else {
            return two_ab;
        }
    }
}