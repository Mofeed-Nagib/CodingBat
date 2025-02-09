public String deFront(String str) {
    if (str.length() > 1 && str.charAt(0) != 'a' && str.charAt(1) != 'b') {
        return str.substring(2);
    }
    else if (str.length() > 0 && str.charAt(0) != 'a') {
        return str.substring(1);
    }
    else if (str.length() > 1 && str.charAt(1) != 'b') {
        return str.substring(0, 1) + str.substring(2);
    }
    else {
        return str;
    }
}