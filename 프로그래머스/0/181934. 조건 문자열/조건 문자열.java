class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String equal = ineq + eq;
        
        if (equal.equals(">=")) {
            return n >= m ? 1 : 0;
        } else if (equal.equals("<=")) {
            return n <= m ? 1 : 0;
        } else if (equal.equals(">!")) {
            return n > m ? 1 : 0;
        } else if (equal.equals("<!")) {
            return n < m ? 1 : 0;
        }
        return 0;
    }
}


/**
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return (ineq.equals(">") && eq.equals("=") && n >= m) ||
               (ineq.equals("<") && eq.equals("=") && n <= m) ||
               (ineq.equals(">") && eq.equals("!") && n > m) ||
               (ineq.equals("<") && eq.equals("!") && n < m) ? 1 : 0;
    }
}
**/
