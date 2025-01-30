class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = new int[data.length][4];  // 조건에 맞는 데이터를 임시로 담을 배열
        int sort_num = 0;
        int index = 0;

        // 기준이 될 데이터 필드 정의
        String[] data_set = {"code", "date", "maximum", "remain"};

        // 필터링 및 데이터 저장
        for (int i = 0; i < 4; i++) {
            if (ext.equals(data_set[i])) {
                for (int j = 0; j < data.length; j++) {
                    if (data[j][i] < val_ext) {
                        answer[index++] = data[j];  // 조건에 맞는 데이터를 answer에 추가
                    }
                }
            }
            if (sort_by.equals(data_set[i])) {
                sort_num = i;  // 정렬 기준 인덱스 설정
            }
        }

        // 조건에 맞는 데이터 크기에 맞게 answer 배열을 복사하여 filteredData 생성
        int[][] filteredData = new int[index][4];
        for (int i = 0; i < index; i++) {
            filteredData[i] = answer[i];
        }

        // 정렬 (선택 정렬 사용)
        for (int i = 0; i < filteredData.length - 1; i++) {
            for (int j = i + 1; j < filteredData.length; j++) {
                if (filteredData[i][sort_num] > filteredData[j][sort_num]) {
                    int[] temp = filteredData[i];
                    filteredData[i] = filteredData[j];
                    filteredData[j] = temp;
                }
            }
        }

        // 정렬된 데이터를 반환
        return filteredData;
    }
}
