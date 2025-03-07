def solution(my_string):
    answer = 0
    str = ''
    for i in my_string:
        if i.isdigit():
            str += i
        else :
            if str:
                answer += int(str)
                str = ''
    if str:
        answer += int(str)
    return answer