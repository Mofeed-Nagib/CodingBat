public String stringSplosion(String str) {
    for (int i = str.length() - 1; i >= 0 ; i--) {
        str = str.substring(0, i) + str;
    }
    return str;
}