def solution(mats, park):
    # 돗자리를 큰 것부터 시도하기 위해 내림차순 정렬
    mats.sort(reverse=True)
    rows = len(park)
    cols = len(park[0])

    # 특정 크기의 돗자리를 해당 위치에 깔 수 있는지 확인하는 함수
    def can_place(mat_size, r, c):
        if r + mat_size > rows or c + mat_size > cols:
            return False  # 돗자리가 공원 범위를 벗어남

        for i in range(r, r + mat_size):
            for j in range(c, c + mat_size):
                if park[i][j] != "-1":
                    return False  # 사람이나 장애물이 있는 경우 배치 불가
        return True

    # 가장 큰 돗자리부터 확인
    for mat in mats:
        for i in range(rows):
            for j in range(cols):
                if can_place(mat, i, j):
                    return mat  # 가장 큰 돗자리를 찾으면 즉시 반환

    return -1  # 배치할 수 있는 돗자리가 없으면 -1 반환
