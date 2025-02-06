def sum67(nums):
    sum = 0
    seen = False
    for i in nums:
        if seen:
            if i == 7:
                seen = False
            continue
        else:
            if i == 6:
                seen = True
                continue
            sum += i
    return sum