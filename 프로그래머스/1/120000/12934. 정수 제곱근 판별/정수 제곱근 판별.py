def solution(n):
    answer = 0
    i = 0 
    while i <= n:
        if i * i == n :
            return (i + 1) ** 2
        i += 1
    return -1