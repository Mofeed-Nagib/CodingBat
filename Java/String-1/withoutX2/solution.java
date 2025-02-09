public String withoutX2(String str) {
    if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
        str = str.substring(2);
    }
    else if (str.length() > 1 && str.charAt(1) == 'x') {
        str = str.substring(0, 1) + str.substring(2);
    }
    else if (str.length() > 0 && str.charAt(0) == 'x') {
        str = str.substring(1);
    }
    return str;
}