class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 6 && s.length() != 4) {
            return false;
        }
        for (char i : s.toCharArray()) {
            if (i < '0' || i > '9') {
                return false;
            } 
        }
        return answer;
    }
}