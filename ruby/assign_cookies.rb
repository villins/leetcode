def find_content_children(g, s)
  g = g.sort
  s = s.sort
  i = g.size - 1
  j = s.size - 1
  num = 0
  while(i >= 0 && j >= 0) do
    if(s[j] >= g[i])
      num += 1
      i -= 1
      j -= 1
    else
      i -= 1
    end
  end
  num
end

puts find_content_children([1,2], [1,2,3])
puts find_content_children([1,2,3], [1,1])
