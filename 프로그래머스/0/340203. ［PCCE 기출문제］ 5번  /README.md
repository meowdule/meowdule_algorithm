# [level 0] [PCCE 기출문제] 5번 / 심폐소생술 - 340205

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340205)

### 성능 요약

메모리: 85.3 MB, 시간: 287.15 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>
합계: 100.0 / 100.0

### 제출 일자

2025년 01월 24일 09:10:08

### 문제 설명

<p>심폐소생술은 다음과 같은 순서를 통해 실시합니다.</p>

1. 심정지 및 무호흡 확인 [check]
2. 도움 및 119 신고 요청 [call]
3. 가슴압박 30회 시행 [pressure]
4. 인공호흡 2회 시행 [respiration]
5. 가슴압박, 인공호흡 반복 [repeat]

<p>주어진 `solution` 함수는 심폐소생술을 하는 방법의 순서가 담긴 문자열들이 무작위 순서로 담긴 리스트 `cpr`이 주어질 때 각각의 방법이 몇 번째 단계인지 순서대로 담아 `return`하는 함수입니다. `solution` 함수가 올바르게 작동하도록 빈칸을 채워 완성해 주세요.</p>

<hr>

<h4>제한사항</h4>

<ul>
<li>`cpr`은 다음 문자열들이 한 번씩 포함되어 있습니다.
  - "check", "call", "pressure", "respiration", "repeat"
</li>
</ul>

<hr>

<h4>입출력 예</h4>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>["call", "respiration", "repeat", "check", "pressure"]
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>[2, 4, 5, 1, 3]
</code></pre></div>

<p>입력 #2</p>
<div class="highlight"><pre class="codehilite"><code>["respiration", "repeat", "check", "pressure", "call"]
</code></pre></div>
<p>출력 #2</p>
<div class="highlight"><pre class="codehilite"><code>[4, 5, 1, 3, 2]
</code></pre></div>

<hr>

<h4>입출력 예 설명</h4>

<p>입출력 예 #1</p>
<ul>
<li>"call", "respiration", "repeat", "check", "pressure"은 각각 2, 4, 5, 1, 3 번째 순서이므로 [2, 4, 5, 1, 3]을 리턴합니다.</li>
</ul>

<p>입출력 예 #2</p>
<ul>
<li>"respiration", "repeat", "check", "pressure", "call"은 각각 4, 5, 1, 3, 2 번째 순서이므로 [4, 5, 1, 3, 2]를 리턴합니다.</li>
</ul>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

