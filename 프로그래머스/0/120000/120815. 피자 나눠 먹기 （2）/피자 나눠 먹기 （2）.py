def solution(n):
    answer = 0
    # for 문으로 i * 6 % n == 0 출력
    for i in range(1, n+1) :
        if i * 6 % n == 0:
            return i