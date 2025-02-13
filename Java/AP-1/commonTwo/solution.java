public int commonTwo(String[] a, String[] b) {
    int count = 0;
    for (int i = 0, j = 0; i < a.length && j < b.length;) {
        if (a[i].compareTo(b[j]) == 0) {
            count++;
            i++;
            j++;
            while (i < a.length && a[i - 1].equals(a[i])) {
                i++;
            }
            while (j < b.length && b[j - 1].equals(b[j])) {
                j++;
            }
        }
        else if (a[i].compareTo(b[j]) < 0) {
            i++;
        }
        else {
            j++;
        }
    } 
    return count;
}