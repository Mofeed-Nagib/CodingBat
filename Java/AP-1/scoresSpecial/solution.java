public int scoresSpecial(int[] a, int[] b) {
    return findSpecial(a) + findSpecial(b);
}

public int findSpecial(int[] nums) {
    int max = 0;
    for (int num : nums) {
        if (num % 10 == 0 && num > max) {
            max = num;
        }
    }
    return max;
}