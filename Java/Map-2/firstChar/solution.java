public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (String str : strings) {
        if (!map.containsKey(str.substring(0, 1))) {
            map.put(str.substring(0, 1), str);
        }
        else {
            map.put(str.substring(0, 1), map.get(str.substring(0, 1)) + str);
        }
    }
    return map;
}