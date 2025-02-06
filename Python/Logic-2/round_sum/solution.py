def round_sum(a, b, c):
    return sum(round10(i) for i in [a, b, c])

def round10(num):
    return num + 10 - num % 10 if num % 10 >= 5 else num - num % 10