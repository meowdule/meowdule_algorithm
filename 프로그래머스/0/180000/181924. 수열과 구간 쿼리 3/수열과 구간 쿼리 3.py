def solution(arr, queries):
    for i, j in queries:
        # i와 j의 값을 서로 교환
        arr[i], arr[j] = arr[j], arr[i]
    return arr
