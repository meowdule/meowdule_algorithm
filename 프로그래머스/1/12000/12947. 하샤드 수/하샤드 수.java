class Solution {
    public boolean solution(int x) {
        int sumX = 0, numX = x;
        while (numX > 0) {
            sumX += numX % 10;
            numX /= 10;
        } 
        return x % sumX == 0;
    }
}