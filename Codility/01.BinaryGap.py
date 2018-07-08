
# ToDo
# N -> 2진수
# 2진수에서 1이 있는 index 추출
# 인덱스의 차가 Max가 되는 값 찾기


def binary_gap(value):
    n = bin(value)[2:]

    index_list = []
    for idx, value in enumerate(n):
        if value == '1':
            index_list.append(idx)

    close_list = []
    for i in range(len(index_list)-1):
        close_list.append(index_list[i+1] - index_list[i] - 1)
    return max(close_list)


assert(binary_gap(5) == 1)
assert(binary_gap(1004) == 1)
assert(binary_gap(4213) == 5)
assert(binary_gap(9999) == 4)

