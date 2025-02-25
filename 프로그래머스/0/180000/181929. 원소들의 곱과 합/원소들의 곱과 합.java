class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int plus = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            plus = plus * num_list[i];
        }
        return (int) Math.pow(sum, 2) > plus ? 1 : 0;
    }
}