def solution(wallet, bill):
    answer = 0
    while max(wallet) < max(bill) or min(bill) > min(wallet) :
        bill[bill.index(max(bill))] = max(bill)//2
        answer += 1  # 접는 횟수 증가

    return answer
