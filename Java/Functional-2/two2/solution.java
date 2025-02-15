public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(n -> 2 * n);
    nums.removeIf(n -> n % 10 == 2);
    return nums;
}