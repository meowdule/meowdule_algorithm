class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (char num : rsp.toCharArray()) {
            if (num =='2') {
                answer += "0";
            } else if (num == '0') {
                answer += "5";
            } else if (num == '5') {
                answer += "2";
            }
        }
        return answer;
    }
}