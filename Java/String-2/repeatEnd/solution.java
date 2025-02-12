public String repeatEnd(String str, int n) {
    String string = "";
    for (int i = 0; i < n; i++) {
        string += str.substring(str.length() - n);
    }
    return string;
}