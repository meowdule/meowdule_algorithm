class Solution {
    public int solution(int[] sides) {
        int num1 = Math.max(sides[0], sides[1]);
        int num2 = Math.min(sides[0], sides[1]);
        int answer = 0;
        for(int i = num1; i < num1 + num2; i++) {
            answer++;
        }
        for(int i = num1 - num2; i < num1 - 1; i++) {
            answer++;
        }
        return answer;
    }
}