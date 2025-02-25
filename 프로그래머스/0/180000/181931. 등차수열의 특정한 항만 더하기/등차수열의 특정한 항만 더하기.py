def solution(a, d, included):
    answer = 0
    ad = a
    for i in range(len(included)):
        if included[i]:
            answer += ad
        ad += d
    return answer