str = input()
answer = ''                         # 빈 문자열 생성

for i in str:
    if i.isupper() == True:
        answer += i.lower()         # 대문자면 소문자로 변환
    elif i.islower() == True:
        answer += i.upper()         # 소문자면 대문자로 변환
        
print(answer)