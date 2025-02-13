public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
        if (!words[i].equals(target)) {
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