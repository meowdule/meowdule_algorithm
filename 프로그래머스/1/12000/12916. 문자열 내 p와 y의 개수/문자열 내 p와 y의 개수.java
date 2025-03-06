class Solution {
    boolean solution(String s) {
        int numP = 0;
        int numY = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') numP++;
            else if (c == 'y') numY++;
        }
        
        return numP == numY;
    }
}