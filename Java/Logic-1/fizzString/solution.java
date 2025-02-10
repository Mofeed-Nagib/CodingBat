public String fizzString(String str) {
    String string = "";
    if (str.charAt(0) == 'f') {
        string += "Fizz";
    }
    if (str.charAt(str.length() - 1) == 'b') {
        string += "Buzz";
    }
    return string.length() > 0 ? string : str;
}