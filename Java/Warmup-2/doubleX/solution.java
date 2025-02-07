boolean doubleX(String str) {
    return str.length() - 1 > str.indexOf("x") ? str.charAt(str.indexOf("x") + 1) == 'x' : false;
}