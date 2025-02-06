def lucky_sum(a, b, c):
    return sum([a, b, c] if 13 not in [a, b, c] else [a, b, c][:[a, b, c].index(13)])