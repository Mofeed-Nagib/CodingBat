public String withoutString(String base, String remove) {
    String string = "";
    int i = 0;
    while (i <= base.length() - remove.length()) {
        if (base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase())) {
            i += remove.length();
        }
        else {
            string += base.substring(i, i + 1);
            i++;
        }
    }
    if (i < base.length()) {
        string += base.substring(i);
    }
    return string;
}