# 递归
def  max_depth(root)
  return 0 unless root
  return ( 1 + [max_depth(root.left), max_depth(root.right)] )
end

# 同层节点轮训

def max_depth(root)
  return 0 unless root

  depth = 0
  q = [].push(root)

  while q.any? do
    depth = depth + 1
    size = q.size

    size.times do
      node = q.shift
      q.push(node.left) if node.left
      q.push(node.right) if node.right
    end
  end

  depth
end


puts max_depth(nil)
