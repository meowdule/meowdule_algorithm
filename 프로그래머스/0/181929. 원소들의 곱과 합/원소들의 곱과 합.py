def solution(num_list):
    sum = 0
    plus = 1
    for i in num_list:
        sum += i
        plus *= i
    if sum ** 2 > plus :
        return 1
    else:
        return 0