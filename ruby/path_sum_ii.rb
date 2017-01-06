def path_sum(root, sum)
  ans = []
  path = []

  dfs(root, sum, path, ans)
  ans
end

def dfs(node, sum, path, ans)
  return ans unless node

  path.push(node.val)

  if node.left || node.right
    dfs(node.left, sum, path, ans)
    dfs(node.right, sum, path, ans)
  else
    if path.inject(:+) == sum
      ans << path.clone
    end
  end

  path.pop
end
