# [level 0] [PCCE 기출문제] 3번 / 나이 계산 - 340206

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340207?language=java)

### 성능 요약


### 구분

코딩테스트​ 연습 > 코딩​ 기초​ 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 27일 08:30:33

### 문제 설명

<p>나이를 세는 방법은 여러 가지가 있습니다. 그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 연 나이는 태어난 순간 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 각각 나이의 계산법은 다음과 같습니다.</p>

<ul>
<li>한국식 나이: 현재 연도 - 출생 연도 + 1</li>
<li>연 나이: 현재 연도 - 출생 연도</li>
</ul>

<p>출생 연도를 나타내는 정수 <code>year</code>와 구하려는 나이의 종류를 나타내는 문자열 <code>age_type</code>이 주어질 때 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요. <code>age_type</code>이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.</p>

<hr>

### 제한사항

<ul>
<li>1950 ≤ <code>year</code> ≤ 2030</li>
<li><code>age_type</code>은 "Korea" 또는 "Year"만 주어집니다.</li>
</ul>

<hr>

### 입출력 예

#### 입력 예시 1
```
2000
Korea
```

#### 출력 예시 1
```
31
```

#### 입력 예시 2
```
1999
Year
```

#### 출력 예시 2
```
31
```

<hr>

### 코드 예시

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer);
    }
}
```

<hr>

### 입출력 설명

#### 입출력 예 #1
- 2030년에 2000년생의 한국식 나이는 `2030 - 2000 + 1 = 31`살입니다.

#### 입출력 예 #2
- 2030년에 1999년생의 연 나이는 `2030 - 1999 = 31`살입니다.

<hr>

### 해결 전략

1. `year` 값을 입력받습니다.
2. `age_type` 값을 입력받아 한국식 나이 또는 연 나이를 계산합니다.
3. 적절한 수식을 적용하여 결과를 출력합니다.

<hr>

### 관련 링크

[프로그래머스 문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340207)

