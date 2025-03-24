def solution(start_num, end_num):
    answer = []
    for i in range(start_num, end_num-1, -1):
        answer.append(start_num)
        start_num = start_num - 1
    return answer