var getSum = function(a, b) {
  var ans = 0
  while( b !== 0 ) {
    ans = a^b;
    b = ((a&b)<<1);
    a = ans;
  }
  return a
}

console.log(getSum(3,39))
