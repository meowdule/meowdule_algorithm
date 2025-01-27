# [level 0] [PCCE 기출문제] 4번 / 저축 - 340208

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340208?language=java)

### 성능 요약

메모리: 70.1 MB, 시간: 150.79 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0  
합계: 100.0 / 100.0

### 제출 일자

2025년 01월 28일 14:45:00

---

### 문제 설명

<p>진우는 돈을 모으기 위해 저축을 하려고 합니다. 목표로 하는 금액은 100만 원이며, 첫 달에 일정 금액을 넣은 뒤 70만 원까지는 매월 조금씩 저축하다가 70만 원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하고자 합니다.</p>

<p>첫 달에 저축하는 금액을 나타내는 정수 <code>start</code>, 두 번째 달부터 70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 <code>before</code>, 100만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 <code>after</code>가 주어질 때, 100만 원 이상을 모을 때까지 걸리는 개월 수를 구하는 프로그램을 작성하세요.</p>

<hr>

<h4>제한사항</h4>

<ul>
<li>0 ≤ <code>start</code> ≤ 99</li>
<li>1 ≤ <code>before</code> ≤ <code>after</code> ≤ 25</li>
</ul>

<hr>

<h4>입출력 예</h4>
<table class="table">
        <thead><tr>
<th>start</th>
<th>before</th>
<th>after</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>28</td>
<td>6</td>
<td>8</td>
<td>12</td>
</tr>
<tr>
<td>75</td>
<td>8</td>
<td>25</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h4>입출력 예 설명</h4>

<p>입출력 예 #1</p>

<ul>
<li>첫 달에 28만 원을 저축하며, 70만 원이 될 때까지 매월 6만 원씩 저축합니다.</li>
<li>70만 원 이후에는 매월 8만 원씩 저축합니다.</li>
<li>총 12개월이 걸립니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>첫 달에 75만 원을 저축하며, 다음 달에 25만 원을 저축합니다.</li>
<li>총 2개월이 걸립니다.</li>
</ul>

<hr>

<ul>
<li>cpp를 응시하는 경우 리스트는 배열과 동일한 의미이니 풀이에 참고해주세요.

<ul>
<li>ex) 번호가 담긴 정수 <u><strong>리스트</strong></u> <code>numbers</code>가 주어집니다. =&gt; 번호가 담긴 정수 <u><strong>배열</strong></u> <code>numbers</code>가 주어집니다.</li>
</ul></li>
<li>java를 응시하는 경우 리스트는 배열, 함수는 메소드와 동일한 의미이니 풀이에 참고해주세요.

<ul>
<li>ex) solution <u><strong>함수</strong></u>가 올바르게 작동하도록 빈칸을 채워 주세요. =&gt; solution <u><strong>메소드</strong></u>가 올바르게 작동하도록 빈칸을 채워 주세요.</li>
</ul></li>
</ul>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
