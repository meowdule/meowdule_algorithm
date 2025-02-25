def solution(ineq, eq, n, m):
    # 두 문자열을 조합하여 하나의 연산자로 취급
    equal = ineq + eq
    
    # 조합된 문자열에 따른 조건 비교 수행
    if equal == ">=":
        return 1 if n >= m else 0
    elif equal == "<=":
        return 1 if n <= m else 0
    elif equal == ">!":
        return 1 if n > m else 0
    elif equal == "<!":
        return 1 if n < m else 0
    return 0
