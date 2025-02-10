public int stringMatch(String a, String b) {
    int count = 0;
    for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++) {
        if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
            count++;
        }
    }
    return count;
}