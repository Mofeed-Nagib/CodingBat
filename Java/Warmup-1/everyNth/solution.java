public String everyNth(String str, int n) {
    String string = "";
    for (int i = 0; i < str.length(); i += n) {
        string += str.charAt(i);
    }
    return string;
}