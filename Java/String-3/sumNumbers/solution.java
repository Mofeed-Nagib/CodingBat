public int sumNumbers(String str) {
    String current = "";
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
            current += str.charAt(i);
        }
        else if (current.length() > 0) {
            sum += Integer.parseInt(current);
            current = "";
        }
    }
    return current.length() > 0 ? sum + Integer.parseInt(current) : sum;
}