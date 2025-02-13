public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] array = new String[n];
    int aIndex = 0;
    int bIndex = 0;
    for (int i = 0; i < n; i++) {
        if (a[aIndex].compareTo(b[bIndex]) == 0) {
            array[i] = a[aIndex];
            aIndex++;
            bIndex++;
        }
        else if (a[aIndex].compareTo(b[bIndex]) < 1) {
            array[i] = a[aIndex];
            aIndex++;
        }
        else {
            array[i] = b[bIndex];
            bIndex++;
        }
    }
    return array;
}