import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        while (n > 0) {                         // 반복문을 반복하며 n은 1씩 줄어들고 0이되면 반복 종료
            System.out.print(str);
            n -= 1;
        }
    }
}