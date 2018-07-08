# ToDO
# A list에서 K번 이동 => DP
# A = [a1, a2, a3, a4, a5]
# 3이면 A[3:]+A[:2]
# k 가 0 이하면 error
# len(A) == k는 걍 return A


def solution(a, k):
    if k < 0 or k > 100:
        raise ValueError("K is not correct number")

    elif len(a) == k:
        return a

    else:
        result = a[k-1:] + a[:k-1]
        return result


assert(solution([3, 8, 9, 7, 6], 3) == [9, 7, 6, 3, 8])
assert(solution([0, 0, 0], 1) == [0, 0, 0])
assert(solution([1, 2, 3, 4], 4) == [1, 2, 3, 4])
