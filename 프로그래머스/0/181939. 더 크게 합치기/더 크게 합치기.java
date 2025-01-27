class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        
        // 두 문자열을 비교하여 더 큰 값을 선택
        // ab가 ba보다 크거나 같으면 ab를 선택, 아니면 ba를 선택
        if(ab.compareTo(ba) >= 0){
            answer = Integer.parseInt(ab);
        } else {
            answer = Integer.parseInt(ba);
        }
        return answer;
    }
}