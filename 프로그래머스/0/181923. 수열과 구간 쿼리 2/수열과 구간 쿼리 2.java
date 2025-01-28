import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int num = Integer.MAX_VALUE; // 초기값을 매우 큰 값으로 설정

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    num = Math.min(num, arr[i]);
                }
            }

            if (num != Integer.MAX_VALUE) {
                result.add(num);
            } else {
                result.add(-1);
            }
        }

        // List를 배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
