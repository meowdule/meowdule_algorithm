class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();

        // 리스트의 각 숫자를 검사하여 홀수/짝수를 문자열로 결합
        for (int num : num_list) {
            if (num % 2 == 1) {
                oddStr.append(num);  // 홀수 추가
            } else {
                evenStr.append(num); // 짝수 추가
            }
        }

        return Integer.parseInt(oddStr.toString()) + Integer.parseInt(evenStr.toString());
    }
}