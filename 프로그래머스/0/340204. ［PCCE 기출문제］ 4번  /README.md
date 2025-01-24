# [level 0] [PCCE 기출문제] 4번 / 병과분류 - 340204

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340204) 

### 성능 요약



### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 24일 09:10:08

### 문제 설명

<p>퓨쳐종합병원에서는 접수한 환자가 진료받을 병과에 따라 자동으로 환자 코드를 부여해 주는 프로그램이 있습니다. 환자 코드의 마지막 네 글자를 보면 환자가 어디 병과에서 진료를 받아야 할지 알 수 있습니다. 예를 들어 환자의 코드가 "_eye"로 끝난다면 안과를, "head"로 끝난다면 신경외과 진료를 보게 됩니다. 환자 코드의 마지막 글자에 따른 병과 분류 기준은 다음과 같습니다.

마지막 글자	병과
"_eye"	"Ophthalmologyc"
"head"	"Neurosurgery"
"infl"	"Orthopedics"
"skin"	"Dermatology"
환자의 코드를 나타내는 문자열 code를 입력받아 위 표에 맞는 병과를 출력하도록 빈칸을 채워 코드를 완성해 주세요. 위 표의 단어로 끝나지 않는다면 "direct recommendation"를 출력합니다.</p>

<hr>

<h4>제한사항</h4>

<ul>
<li>10 ≤ <code>number</code> ≤ 2,000,000,000

<ul>
<li><code>number</code>의 자릿수는 2의 배수입니다.</li>
</ul></li>
</ul>

<hr>

<h4>입출력 예</h4>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>4859
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>107
</code></pre></div>
<p>입력 #2</p>
<div class="highlight"><pre class="codehilite"><code>29
</code></pre></div>
<p>출력 #2</p>
<div class="highlight"><pre class="codehilite"><code>29
</code></pre></div>
<hr>

<h4>입출력 예 설명</h4>

<p>입출력 예 #1</p>

<ul>
<li>입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.</li>
<li>48 + 59 = 107</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.</li>
<li>29 &nbsp;= 29</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
