public int[] squareUp(int n) {
    int[] array = new int[n * n];
    for (int i = 0; i < n; i++) {
        int start = (i + 1) * n - 1;
        for (int j = 1; j <= i + 1; j++) {
            array[start--] = j;
        }
    }
    return array;
}