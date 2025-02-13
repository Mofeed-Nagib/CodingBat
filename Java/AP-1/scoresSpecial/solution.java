public int scoresSpecial(int[] a, int[] b) {
    return findSpecial(a) + findSpecial(b);
}

public int findSpecial(int[] array) {
    int max = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 10 == 0 && array[i] > max) {
            max = array[i];
        }
    }
    return max;
}