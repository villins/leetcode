def find_the_difference(s, t)
  ftd = ""
  s.each_char do |char|
    i = t.index(char)
    unless i
      ftd = char
      break
    else
      t.slice!(i)
    end
  end

  ftd = t if t.size == 1
  ftd
end

puts find_the_difference("a", "aa")
puts find_the_difference("dsdsdsd", "dsdfsdsd")
