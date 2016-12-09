// 寻常做法
var findTheDifference = function(s, t) {
  var ftd = "",
    length = s.length;
  for(var i = 0; i < length; i++) {
    index = t.indexOf(s[i]);
    if(index > -1) {
      t = t.slice(0, index) + t.slice(index+1, t.length)
    } else {
      ftd = s[i];
      break;
    }
  }
  if (t.length == 1){
    ftd = t;
  }
  return ftd
}

// 异或Unicode 编码
var findTheDifference = function(s, t){
  var c = t.charCodeAt(t.length-1);
  for(var i=0; i < s.length; i++){
    c = c ^ s.charCodeAt(i) ^ t.charCodeAt(i);

  }
  return String.fromCharCode(c);
}

console.log(findTheDifference("a", "aa"))
console.log(findTheDifference("dfsadfd", "dfsadfde"))
