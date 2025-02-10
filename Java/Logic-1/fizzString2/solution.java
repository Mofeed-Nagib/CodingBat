public String fizzString2(int n) {
    String string = "";
    if (n % 3 == 0) {
        string += "Fizz";
    }
    if (n % 5 == 0) {
        string += "Buzz";
    }
    return string.length() > 0 ? string + "!" : n + "!";
}