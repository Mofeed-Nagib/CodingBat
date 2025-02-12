public String starOut(String str) {
    if (str.indexOf("*") == -1) {
        return str;
    }
    else {
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) != '*' && str.charAt(i) != '*' && str.charAt(i + 1) != '*') {
                result += str.charAt(i);
            }
        }
        if (str.indexOf("*") > 1) {
            result = str.charAt(0) + result;
        }
        if (str.lastIndexOf("*") < str.length() - 2) {
            result = result + str.charAt(str.length() - 1);
        }
        return result;
    } 
}