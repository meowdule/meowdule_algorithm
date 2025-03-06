class Solution {
    public int[] solution(long n) {
        String strA = "" + n;
        int[] answer = new int[strA.length()];
        for (int i = 0; i < strA.length(); i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}