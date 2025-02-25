def solution(a, b):
    answer = 0
    ab = int(f"{a}{b}")
    ba = int(f"{b}{a}")
    answer = max(ab, ba)
    return answer