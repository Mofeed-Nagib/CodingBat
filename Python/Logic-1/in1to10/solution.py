def in1to10(n, outside_mode):
    return outside_mode and (n >= 10 or n <= 1) or not outside_mode and 1 <= n <= 10