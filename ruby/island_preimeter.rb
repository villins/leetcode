def island_perimeter(grid)
  n = 0
  l = grid.length - 1
  grid.each_with_index do |g, i|
    gl = g.length - 1
    g.each_with_index do |d, j|
      next if d == 0
      al = []
      al.push([i-1,j])
      al.push([i+1,j])
      al.push([i,j+1])
      al.push([i,j-1])
      puts al.to_s
      al.each do |a|
        b, c = a
        if  b < 0 || b > l
          n = n + 1
        elsif c < 0 || c > gl
          n = n + 1
        else
          if grid[b][c] == 0
            n = n + 1
          end
        end
      end
    end
  end
  n
end

a = [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

puts island_perimeter(a)

a = [[1,1]]

puts island_perimeter(a)
