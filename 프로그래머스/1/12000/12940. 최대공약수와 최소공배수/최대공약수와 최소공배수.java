class Solution {
    public int[] solution(int n, int m) {
        int a = n, b = m;
        while ( b != 0 ) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return new int[] {a, (n * m) / a};
    }
}