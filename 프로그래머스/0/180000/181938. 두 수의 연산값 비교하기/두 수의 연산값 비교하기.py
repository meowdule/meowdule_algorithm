def solution(a, b):
    answer = 0
    ab = int(f"{a}{b}")
    ab2 = 2 * a * b
    answer = max(ab, ab2)
    return answer