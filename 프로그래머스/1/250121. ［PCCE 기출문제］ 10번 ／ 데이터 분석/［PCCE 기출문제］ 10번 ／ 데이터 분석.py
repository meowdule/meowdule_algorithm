def solution(data, ext, val_ext, sort_by):
    # 기준이 될 데이터 필드 정의
    data_set = ["code", "date", "maximum", "remain"]

    # 필터링 단계: ext 조건에 맞는 데이터만 추출
    filtered_data = []
    ext_index = data_set.index(ext)
    sort_index = data_set.index(sort_by)

    for row in data:
        if row[ext_index] < val_ext:
            filtered_data.append(row)

    # 정렬 단계: sort_by 기준으로 오름차순 정렬
    filtered_data.sort(key=lambda x: x[sort_index])

    return filtered_data
