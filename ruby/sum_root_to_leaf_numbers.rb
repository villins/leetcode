
def sum_numbers(root)
  sum = 0
  return sum unless root
  queue = []
  queue.push([root, root.val.to_s])
  while(queue.any?) do
    node, val = queue.pop
    if node.left || node.right
      if node.left
        queue.push([node.left, val+node.left.val.to_s])
      end
      if node.right
        queue.push([node.right, val+node.right.val.to_s])
      end
    else
      sum = sum + val.to_i
    end
  end
  return sum
end
