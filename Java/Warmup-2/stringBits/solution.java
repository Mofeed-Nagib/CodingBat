public String stringBits(String str) {
    String string = "";
    for (int i = 0; i < str.length(); i += 2) {
        string += str.charAt(i);
    }
    return string;
}