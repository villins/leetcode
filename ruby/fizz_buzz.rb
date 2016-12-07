def fizz_buzz(n)
  na = []
  1.upto(n) do |i|
    if i % 3 == 0 && i % 5 == 0
      na.push 'FizzBuzz'
    elsif i % 5 == 0
      na.push 'Buzz'
    elsif i % 3 == 0
      na.push 'Fizz'
    else
      na.push i.to_s
    end
  end
  na
end
