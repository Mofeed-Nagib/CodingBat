public boolean inOrder(int a, int b, int c, boolean bOk) {
    return a < b && b < c || bOk && b < c;
}