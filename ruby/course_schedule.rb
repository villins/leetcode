require 'set'
def can_finish(num_courses, prerequisites)
  posts = []
  pre_nums = Array.new(num_courses, 0)
  num_courses.times do
    posts.push(Set.new)
  end

  length = prerequisites.size
  (0...length).each do |i|
    pr = prerequisites[i]
    posts[pr[1]].add( pr[0] )
  end

  (0...num_courses).each do |i|
    post = posts[i]
    post.each do |c|
      pre_nums[c] = pre_nums[c] + 1
    end
  end

  (0...num_courses).each do |i|
    j = 0

    while(j < num_courses) do
      break if pre_nums[j] == 0
      j = j + 1
    end

    return false if j == num_courses

    pre_nums[j] = -1

    post = posts[j]
    post.each do |c|
      pre_nums[c] = pre_nums[c] - 1
    end
  end
  return true
end

puts can_finish(2, [[1,0]])
puts can_finish(3, [[0,2],[1,2],[2,0]])
