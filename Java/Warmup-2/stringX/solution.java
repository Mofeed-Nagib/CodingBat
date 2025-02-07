public String stringX(String str) {
    String string = "";
    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) != 'x') {
            string += str.charAt(i);
        }
    }
    return str.length() > 1 ? str.charAt(0) + string + str.charAt(str.length() - 1) : str;
}