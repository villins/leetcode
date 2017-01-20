function shuffle(arr){
    var len = arr.length;
  for(var i = 0; i < len - 1; i++){
        var idx = Math.floor(Math.random() * (len - i));
        var temp = arr[idx];
        arr[idx] = arr[len - i - 1];
        arr[len - i -1] = temp;

  }
    return arr;

}

var arr = [0,1,2,3,4,5,6,7,8,9];
var res = [0,0,0,0,0,0,0,0,0,0];

var t = 10000;
for(var i = 0; i < t; i++){
    var sorted = shuffle(arr.slice(0));
  sorted.forEach(function(o,i){
        res[i] += o;

  });

}

res = res.map(function(o){
    return o / t;

});

console.log(res);
