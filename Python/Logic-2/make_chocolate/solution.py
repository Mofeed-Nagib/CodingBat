def make_chocolate(small, big, goal):
    return goal - 5 * min(big, goal // 5) if goal - 5 * min(big, goal // 5) <= small else -1