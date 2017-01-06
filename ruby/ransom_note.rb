def can_construct(ransom_note, magazine)
  flag = true
  ransom_note.each_char do |c|
    unless ransom_note.count(c) <= magazine.count(c)
      flag = false
      break
    end
  end
  flag
end
