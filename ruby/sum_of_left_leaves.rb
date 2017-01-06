def sum_of_left_leaves(root)
  sum = 0
  return sum unless root
  stack = []
  stack.push([root, false])

  while(stack.any?) do
    node, is_left = stack.pop
    if node.left || node.right
      stack.push([node.left, true]) if node.left
      stack.push([node.right, false]) if node.right
    else
      sum += node.val if is_left
    end
  end
  sum
end
