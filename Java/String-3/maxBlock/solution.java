public int maxBlock(String str) {
    char c = 'a';
    int max = 0;
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == c) {
            count++;
        }
        else {
            c = str.charAt(i);
            max = Math.max(max, count);
            count = 1;
        }
    }
    return Math.max(max, count);
}