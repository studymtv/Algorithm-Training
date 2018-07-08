def frog_jmp(x, y, d):
    distance = y - x
    if distance % d == 0:
        return distance // d
    else:
        return distance // d + 1

