def intersection(num1, num2)
  h = {}
  num1.each{ |num| h[num] = true }

  list = []
  num2.each{ |num| list.push(num) if h[num] }
  list.uniq
end

p intersection([1, 2, 2, 1], [2, 2])
