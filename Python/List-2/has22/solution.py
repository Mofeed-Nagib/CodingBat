def has22(nums):
    return sum(nums[i: i + 2] == [2, 2] for i in range(len(nums) - 1)) == 1