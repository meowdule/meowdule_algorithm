class Solution {
    public long solution(long n) {
        long sqr = (long) Math.sqrt(n);
        return (sqr * sqr == n)? (sqr + 1)*(sqr + 1) : -1;
    }
}