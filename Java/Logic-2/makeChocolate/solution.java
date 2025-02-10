public int makeChocolate(int small, int big, int goal) {
    return (5 * big + small < goal || goal % 5 > small) ? -1 : Math.max(goal - big * 5, goal % 5);
}