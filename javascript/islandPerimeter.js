var islandPerimeter = function(grid){
  var n = 0;
  var l = grid.length;
  var tl = l - 1;
  for(var i = 0; i < l; i++) {
    var g = grid[i];
    var gl = g.length
    var gtl = gl - 1;
    for(var j = 0; j < gl; j ++){
      if (g[j] === 0) {
        continue;
      }
      var al = [];
      al.push([i-1,j]);
      al.push([i+1,j]);
      al.push([i,j+1]);
      al.push([i,j-1]);
      al.forEach(function(a){
        var b = a[0];
        var c = a[1];
        if (b < 0 || b > tl) {
          n = n + 1
        } else if (c < 0 || c > gtl) {
          n = n + 1
        } else {
          if (grid[b][c] === 0) {
            n = n + 1
          }
        }
      });
    }
  }
  return n;
}

var a = [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

console.log(islandPerimeter(a))

a = [[1,1]]

console.log(islandPerimeter(a))
