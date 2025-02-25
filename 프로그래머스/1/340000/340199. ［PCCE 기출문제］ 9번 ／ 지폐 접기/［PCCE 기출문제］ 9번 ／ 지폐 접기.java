class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (Math.max(wallet[0], wallet[1]) < Math.max(bill[0], bill[1]) ||
               Math.min(wallet[0], wallet[1]) < Math.min(bill[0], bill[1])) {
            
            // bill 배열에서 더 큰 값을 찾아 반으로 줄이기
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            
            answer++;  // 접는 횟수 증가
        }
        return answer;
    }
}