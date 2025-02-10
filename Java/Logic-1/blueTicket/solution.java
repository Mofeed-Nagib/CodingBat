public int blueTicket(int a, int b, int c) {
    if (a + b == 10 || b + c == 10 || a + c == 10) {
        return 10;
    }
    else if (a == 10 + c || b == 10 + c) {
        return 5;
    }
    else {
        return 0;
    }
}