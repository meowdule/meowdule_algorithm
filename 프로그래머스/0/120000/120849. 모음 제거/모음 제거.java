class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char i : my_string.toCharArray()) {
            if ("aeiou".indexOf(i) == -1) {
                answer.append(i);
            }
        }
        return answer.toString();
    }
}