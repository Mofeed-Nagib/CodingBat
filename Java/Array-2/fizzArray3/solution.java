public int[] fizzArray3(int start, int end) {
    int[] array = new int[end - start];
    for (int i = 0; i < end - start; i++) {
        array[i] = start + i;
    }
    return array;
}