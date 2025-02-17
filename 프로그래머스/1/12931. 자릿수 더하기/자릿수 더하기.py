def solution(n):
    num = int(n)
    answer = 0
    
    while num > 0:
        answer += num % 10
        num = num // 10

    return answer