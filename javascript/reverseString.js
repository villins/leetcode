var reverseString = function(s) {
  var sa = s.split("");
  sa = sa.reverse();
  return sa.join("");
}

console.log(reverseString("hello"));
