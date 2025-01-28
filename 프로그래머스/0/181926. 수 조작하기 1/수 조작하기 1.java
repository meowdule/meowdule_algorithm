class Solution {
    public int solution(int n, String control) {
        // control 문자열을 순회하며 n의 값을 수정
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i); // 현재 문자를 가져옴
            if (c == 'w') {
                n += 1; 
            } else if (c == 's') {
                n -= 1; 
            } else if (c == 'd') {
                n += 10; 
            } else if (c == 'a') {
                n -= 10; 
            }
        }
        return n; 
    }
}