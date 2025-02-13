public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> array = new ArrayList<String>();
    for (int i = 0; i < words.length; i++) {
        if (words[i].length() != len) {
            array.add(words[i]);
        }
    }
    return array;
}