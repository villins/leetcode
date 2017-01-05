def invert_tree(root)
  return root unless root
  root.left, root.right = root.right, root.left
  invert_tree(root.left)
  invert_tree(root.right)
  return root
end
