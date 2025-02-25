import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 돗자리를 큰 것부터 시도하기 위해 내림차순 정렬
        Arrays.sort(mats);
        reverseArray(mats);

        int rows = park.length;
        int cols = park[0].length;

        // 특정 크기의 돗자리를 해당 위치에 깔 수 있는지 확인하는 메소드
        for (int mat : mats) {
            for (int i = 0; i <= rows - mat; i++) {
                for (int j = 0; j <= cols - mat; j++) {
                    if (canPlace(mat, i, j, park)) {
                        return mat; // 가장 큰 돗자리를 찾으면 즉시 반환
                    }
                }
            }
        }
        return -1; // 배치할 수 있는 돗자리가 없으면 -1 반환
    }

    // 돗자리를 해당 위치에 배치할 수 있는지 확인하는 메소드
    private boolean canPlace(int matSize, int r, int c, String[][] park) {
        for (int i = r; i < r + matSize; i++) {
            for (int j = c; j < c + matSize; j++) {
                if (!park[i][j].equals("-1")) {
                    return false; // 사람이 있거나 장애물이 있는 경우 배치 불가
                }
            }
        }
        return true;
    }

    // 배열을 내림차순으로 정렬하는 메소드
    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
