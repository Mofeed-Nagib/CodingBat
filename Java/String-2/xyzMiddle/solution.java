public boolean xyzMiddle(String str) {
    if (str.length() < 3) {
        return false;
    }
    int mid = str.length() / 2;
    if (str.length() % 2 == 1) {
        return str.substring(mid - 1, mid + 2).equals("xyz");
    }
    else {
        return str.substring(mid - 2, mid + 1).equals("xyz") || str.substring(mid - 1, mid + 2).equals("xyz");
    }
}