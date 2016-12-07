var fizzBuzz = function(n) {
  var na = [];
  for(var i = 1; i <= n; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      na.push('FizzBuzz');
    } else if ( i % 5 === 0 ) {
      na.push('Buzz');
    } else if ( i % 3 === 0 ) {
      na.push('Fizz');
    } else {
      na.push(i.toString());
    }
  }
  return na
}

console.log(fizzBuzz(15));
