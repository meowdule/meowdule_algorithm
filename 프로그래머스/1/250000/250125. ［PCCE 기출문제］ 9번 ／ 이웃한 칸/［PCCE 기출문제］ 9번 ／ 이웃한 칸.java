class Solution {
    public int solution(String[][] board, int h, int w) {
        // 정수를 저장할 변수 n
        int n = board.length;
        // 같은 색으로 색칠된 칸의 개수 count
        int count = 0;
        // h와 w의 변화량을 저장할 정수 리스트 dh, dw
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        // 반복문 - i값을 0~3까지 1씩 증가
        for (int i = 0; i < 4; i++) {
            // 체크할 칸의 h, w 좌표 변수 h_check, w_check
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count ++;
                }
            }
        }
        return count;
    }
}