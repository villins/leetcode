def min_moves(nums)
  # nums.inject(:+) - nums.size * nums.min
  min = nums.min
  sum = 0
  nums.each do |num|
    sum = sum + (num - min)
  end
  sum
end
