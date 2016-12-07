def single_number(nums)
  n = 0
  nums.each do |num|
    n = n^num
  end
  n
end

puts single_number([1]).to_s
