public String repeatSeparator(String word, String sep, int count) {
    String string = "";
    if (count > 0) {
        string = word;
        for (int i = 1; i < count; i++) {
            string += sep;
            string += word;
        }
    }
    return string;
}