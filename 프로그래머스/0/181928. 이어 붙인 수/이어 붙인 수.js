function solution(num_list) {
    // 홀수만 문자열로 결합
    let oddStr = num_list.filter(num => num % 2 === 1).join('');

    // 짝수만 문자열로 결합
    let evenStr = num_list.filter(num => num % 2 === 0).join('');

    // 문자열을 정수로 변환 후 합산
    return parseInt(oddStr) + parseInt(evenStr);
}