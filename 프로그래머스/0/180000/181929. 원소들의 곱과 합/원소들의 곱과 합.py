def solution(num_list):
    sum = 0
    plus = 1
    for i in num_list:
        sum += i
        plus *= i
    return 1 if sum ** 2 > plus else 0