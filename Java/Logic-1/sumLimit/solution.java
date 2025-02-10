public int sumLimit(int a, int b) {
    return String.valueOf(a).length() == String.valueOf(a + b).length() ? a + b : a;
}