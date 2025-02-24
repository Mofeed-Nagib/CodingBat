public boolean splitOdd10(int[] nums) {
    return splitOdd10Helper(0, 0, 0, nums);
}
  
public boolean splitOdd10Helper(int start, int sum1, int sum2, int[] nums) {
    if (start == nums.length) {
        return sum1 % 10 == 0 && sum2 % 2 == 1;
    }
    return splitOdd10Helper(start + 1, sum1 + nums[start], sum2, nums) || splitOdd10Helper(start + 1, sum1, sum2 + nums[start], nums);
}