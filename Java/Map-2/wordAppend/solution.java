public String wordAppend(String[] strings) {
    String result = "";
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String str : strings) {
        if (!map.containsKey(str)) {
            map.put(str, 1);
        }
        else {
            map.put(str, map.get(str) + 1);
            if (map.get(str) % 2 == 0) {
                result += str;
            }
        }
    }
    return result;
} 