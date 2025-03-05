class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] my_list = my_string.split("");
        String temp = "";
        temp = my_list[num1];
        my_list[num1] = my_list[num2];
        my_list[num2] = temp;
        String answer = String.join("", my_list);
        return answer;
    }
}