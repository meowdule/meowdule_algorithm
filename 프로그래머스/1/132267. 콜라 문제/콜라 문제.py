def solution(a, b, n):
    count_coke = 0
    while n >= a:
        new_coke = (n // a) * b
        count_coke += new_coke
        n = new_coke + (n % a)
    return count_coke