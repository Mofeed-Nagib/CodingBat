public String getSandwich(String str) {
    return str.indexOf("bread") == str.lastIndexOf("bread") ? "" : str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
}