def end_other(a, b):
    return a[len(a) - len(b):].lower() == b.lower() if len(a) > len(b) else b[len(b) - len(a):].lower() == a.lower()