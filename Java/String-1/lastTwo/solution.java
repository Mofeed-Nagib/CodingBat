public String lastTwo(String str) {
    return str.length() > 1 ? str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1) : str;
}