public String zipZap(String str) {
    if (str.length() < 3) {
        return str;
    }
    else {
        String result = "";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 2;
            }
            else {
                result += str.charAt(i);
                if (i == str.length() - 3) {
                    result += str.substring(i + 1);
                }
            }
        }
        return result;
    }
}