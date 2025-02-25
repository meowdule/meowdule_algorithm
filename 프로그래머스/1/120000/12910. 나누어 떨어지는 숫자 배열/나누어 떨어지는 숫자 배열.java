import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer > answerList = new ArrayList <>();
        for (int num : arr) {
            if (num % divisor == 0) {
                answerList.add(num);
            }
        }
        Collections.sort(answerList);
        return (answerList.isEmpty())? new int[] {-1} : answerList.stream().mapToInt(i -> i).toArray();
    }
}