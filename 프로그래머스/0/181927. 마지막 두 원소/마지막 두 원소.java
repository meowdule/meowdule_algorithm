class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];

        // 기존 배열의 값 복사
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        // 마지막 두 요소 비교 후 값 추가
        if (num_list[n - 1] > num_list[n - 2]) {
            answer[n] = num_list[n - 1] - num_list[n - 2];
        } else {
            answer[n] = num_list[n - 1] * 2;
        }

        return answer;
    }
}
