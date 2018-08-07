def solution(A):
    '''
    missing element 찾기
    Worst : O(N)
    1~4의 합 : 10 = 4*5/2
    1~N+1이 있으므로 A의 합은 (len(A)+1)*(len(A)+2)//2
    이거랑 리스트의 합이랑 빼면 끝
    '''
    sum_result = sum(A)
    length = len(A)
    temp_result = (length+1)*(length+2)//2
    return temp_result-sum_result

assert(solution([2, 3, 1, 5]) == 4)
