def solution(num_list):
    str1 = ''.join(str(num_list[i]) for i in range(len(num_list)) if num_list[i] % 2 == 1)
    str2 = ''.join(str(num_list[i]) for i in range(len(num_list)) if num_list[i] % 2 == 0)
    
    return int(str1) + int(str2)