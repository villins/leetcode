# 递归
def add_digits(num)
  ns = num.to_s
  dr = ns.split("").map(&:to_i).inject(0, :+)
  if dr > 9
    dr = add_digits(dr)
  end
  dr
end

# 规律
#def add_digits(num)
  #return (num - 1) % 9 + 1
#end

puts add_digits(0)
