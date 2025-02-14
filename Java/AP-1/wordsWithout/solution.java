public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (String word : words) {
        if (!word.equals(target)) {
            count++;
        }
    }
    String[] array = new String[count];
    for (int i = 0, j = 0; j < count; i++) {
        if (!words[i].equals(target)) {
            array[j] = words[i];
            j++;
        }
    }
    return array;
}