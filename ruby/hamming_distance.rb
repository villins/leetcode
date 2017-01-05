def hamming_distance(x, y)
  (x^y).to_s(2).count("1")
end

p hamming_distance(1, 4)
