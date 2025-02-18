def solution(x):
    sumA = 0
    numx = x
    while numx > 0 :
        sumA += numx % 10
        numx //= 10
    return x % sumA == 0