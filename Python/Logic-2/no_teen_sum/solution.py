def no_teen_sum(a, b, c):
    return sum(fix_teen(i) for i in [a, b, c])

def fix_teen(n):
    if 13 <= n <= 19 and n != 15 and n != 16:
        return 0
    else:
        return n