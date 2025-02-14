public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> array = new ArrayList<String>();
    for (String word : words) {
        if (word.length() != len) {
            array.add(word);
        }
    }
    return array;
}