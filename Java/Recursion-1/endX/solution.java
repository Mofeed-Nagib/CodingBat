public String endX(String str) {
    if (str.length() < 2) {
        return str;
    }
    else if (str.charAt(0) == 'x') {
        return endX(str.substring(1)) + 'x';
    }
    else {
        return str.charAt(0) + endX(str.substring(1));
    }
}