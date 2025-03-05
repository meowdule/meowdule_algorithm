def solution(numbers):
    max_num = numbers[0] * numbers[1]
    for num1 in numbers:
        for num2 in numbers:
            if num1 != num2 and num1 * num2 > max_num:
                max_num = num1 * num2
    return max_num