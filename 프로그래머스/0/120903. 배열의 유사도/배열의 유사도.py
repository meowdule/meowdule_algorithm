def solution(s1, s2):
    answer = 0
    for i in s1:
        for j in s2:
            answer += 1 if i == j else 0
    return answer