public int countYZ(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
            if (Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z') {
                count++;
            }
        }
    }
    return count;
}