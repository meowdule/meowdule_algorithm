import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                answerList.add(i);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}