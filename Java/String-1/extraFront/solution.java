public String extraFront(String str) {
    return str.length() > 1 ? str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2) : str + str + str;
}