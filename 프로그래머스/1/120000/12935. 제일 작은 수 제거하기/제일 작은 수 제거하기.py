def solution(arr):
    if len(arr) == 1:
        return [-1]
    answer = []
    min_value = min(arr)
    answer = arr.copy()
    answer.remove(min_value)
    return answer