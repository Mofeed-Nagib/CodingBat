public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap<String, Boolean>();
    for (String str : strings) {
        if (!map.containsKey(str)) {
            map.put(str, false);
        }
        else {
            map.put(str, true);
        }
    }
    return map;
}