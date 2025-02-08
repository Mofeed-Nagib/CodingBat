public String conCat(String a, String b) {
    return a.length() > 0 && b.length() > 0 && a.substring(a.length() - 1).equals(b.substring(0, 1)) ? a.substring(0, a.length() - 1) + b : a + b;
}