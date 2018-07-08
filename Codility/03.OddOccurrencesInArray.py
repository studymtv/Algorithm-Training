import collections


def odd_occurrences_arry(a):
    for item, count in collections.Counter(a).items():
        if count % 2 != 0:
            return item


assert(odd_occurrences_arry([9, 3, 9, 3, 9, 7, 9]) == 7)
assert(odd_occurrences_arry([1, 2, 3, 4, 1, 2, 3]) == 4)
assert(odd_occurrences_arry([1, 1, 1, 3, 3, 2, 2]) == 1)

