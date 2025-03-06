import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max_num1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int max_num2 = numbers[1] * numbers[0];
        return Math.max(max_num1 , max_num2);
    }
}