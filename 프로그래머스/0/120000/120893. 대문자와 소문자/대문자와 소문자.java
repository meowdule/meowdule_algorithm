class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char i : my_string.toCharArray()) {
            if (Character.isUpperCase(i)) {
                answer += Character.toLowerCase(i);
            } else {
                answer += Character.toUpperCase(i);
            }
        }
        return answer;
    }
}