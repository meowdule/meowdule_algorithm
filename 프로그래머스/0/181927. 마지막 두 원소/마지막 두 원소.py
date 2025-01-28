def solution(num_list):
    answer = num_list[:]    # num_list 복사
    # 조건에 따라 값을 추가
    answer.append(
        num_list[-1] - num_list[-2] if num_list[-1] > num_list[-2] else num_list[-1] * 2
    )  
    return answer