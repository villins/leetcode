def move_zeroes(nums)
  length = nums.length
  i = 0
  j = 0
  while(i < length) do
    if(nums[i] != 0)
      nums[j] = nums[i]
      nums[i] = 0 if i > j
      j += 1
    end
    i += 1
  end
  nums
end

p move_zeroes([0, 1, 0, 3, 12])
p move_zeroes([0,1,0])
p move_zeroes([0,0,1])
p move_zeroes([1])
