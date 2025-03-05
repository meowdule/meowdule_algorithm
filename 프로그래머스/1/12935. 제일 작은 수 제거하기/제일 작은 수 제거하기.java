class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) {
            return new int[]{-1};
        } 
        int[] answer = new int[arr.length -1];
        int index = 0;
        int min_value = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
            }
        }
        for (int num : arr) {
            if(num != min_value) {
                answer[index++] = num;
            }
        }
        return answer;
    }
}