
def sum_numbers(root)
  sum = 0
  return sum unless root
  queue = []
  queue.push([root, root.val])
  while(queue.any?) do
    node, val = queue.pop
    if node.left || node.right
      if node.left
        queue.push([node.left, val * 10 + node.left.val])
      end
      if node.right
        queue.push([node.right, val * 10 + node.right.val])
      end
    else
      sum = sum + val
    end
  end
  return sum
end
