public String wordEnds(String str, String word) {
    String result = "";
    if (str.length() < word.length()) {
        return result;
    }
    else {
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i - 1 >= 0) {
                    result += str.charAt(i - 1);
                }
                if (i + word.length() < str.length()) {
                    result += str.charAt(i + word.length());
                }
            }
        }
        return result;
    }
}  