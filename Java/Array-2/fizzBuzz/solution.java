public String[] fizzBuzz(int start, int end) {
    String[] array = new String[end - start];
    for (int i = start; i < end; i++) {
        String current = "";
        if (i % 3 == 0) {
            current += "Fizz";
        }
        if (i % 5 == 0) {
            current += "Buzz";
        }
        if (current.equals("")) {
            current = String.valueOf(i);
        }
        array[i - start] = current;
    }
    return array;
}