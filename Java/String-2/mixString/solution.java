public String mixString(String a, String b) {
    String string = "";
    for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
        string += a.charAt(i);
        string += b.charAt(i);
    }
    return a.length() > b.length() ? string + a.substring(b.length()) : string + b.substring(a.length());
}