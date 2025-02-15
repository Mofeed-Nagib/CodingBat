public int strDist(String str, String sub) {
    if (str.length() < sub.length()) {
        return 0;
    }
    else if (!str.substring(0, sub.length()).equals(sub)) {
        return strDist(str.substring(1), sub);
    }
    else if (!str.substring(str.length() - sub.length()).equals(sub)) {
        return strDist(str.substring(0, str.length() - 1), sub);
    }
    else {
        return str.length();
    }
}