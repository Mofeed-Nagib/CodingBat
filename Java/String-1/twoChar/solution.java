public String twoChar(String str, int index) {
    return index >= 0 && str.length() > index + 1 ? str.substring(index, index + 2) : str.substring(0, 2);
}