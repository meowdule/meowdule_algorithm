class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int new_coke = (n / a) * b;
            answer += new_coke;
            n = new_coke + (n % a);
        }
        return answer;
    }
}