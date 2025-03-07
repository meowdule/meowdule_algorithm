class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder str_num = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                str_num.append(ch);
            } else {
                if (str_num.length() > 0) {
                    answer += Integer.parseInt(str_num.toString());
                    str_num.setLength(0);
                }
            }
        }
        if (str_num.length() > 0) {
            answer += Integer.parseInt(str_num.toString());
        }
        return answer;
    }
}