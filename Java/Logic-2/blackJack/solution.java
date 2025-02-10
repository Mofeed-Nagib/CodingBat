public int blackjack(int a, int b) {
    if (a > 21 && b > 21) {
        return 0;
    }
    return Math.max(a, b) <= 21 ? Math.max(a, b) : Math.min(a, b);
}