import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";                             // 정답을 넣을 문자열 초기화
        
        for(int i = 0; i<a.length(); i++){              // 문자열 a를 순서대로 i에 대입
            char c = a.charAt(i);                       // 대소문자 구별 가능한 char 타입으로 변환
            if(Character.isUpperCase(c)){               // 대문자면 소문자로 변환
                answer += Character.toLowerCase(c);
            }else{                                      // 소문자면 대문자로 변환
                answer += Character.toUpperCase(c);
            }
        }
       System.out.println(answer);
    }
}