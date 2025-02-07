public String frontTimes(String str, int n) {
    if (str.length() >= 3) {
        str = str.substring(0, 3);
    }
    String string = "";
    for (int i = 0; i < n; i++) {
        string += str;
    }
    return string;
}