public String repeatFront(String str, int n) {
    String string = "";
    for (int i = 0; i < n; i++) {
        string += str.substring(0, n - i);
    }
    return string;
}