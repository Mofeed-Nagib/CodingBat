public String altPairs(String str) {
    String string = "";
    for (int i = 0; i < str.length(); i++) {
        if (i % 4 == 0 || i % 4 == 1) {
            string += str.charAt(i);
        }
    }
    return string;
}