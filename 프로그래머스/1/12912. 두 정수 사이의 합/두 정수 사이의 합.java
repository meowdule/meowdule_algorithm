class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = (a > b)? b : a;
        int max = (a > b)? a : b;
        for (int i = min; i < max + 1; i ++) {
            answer += i;
        }
        return answer;
    }
}