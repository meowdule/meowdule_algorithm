def solution(arr, queries):
    answer = []
    for (s, e, k) in queries:
        num = max(arr) + 1
        for i in range(s, e + 1):
            if arr[i] > k:
                num = min(num, arr[i])
        answer.append(num if num != max(arr) + 1 else -1)
    return answer