def get_sum(a, b)
  ans = 0
  while b != 0 do
    ans = a^b
    b = (a&b)<<1
    a = ans
  end
  a
end

puts get_sum(3, 2)
puts get_sum(-3, 2)
