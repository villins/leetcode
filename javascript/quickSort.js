function quickSort(array){
  if(array.length <= 1) return array;
  var index = Math.floor(array.length/2);
  var mid = array.splice(index, 1)[0];
  var left = [], right = [];
  for(var i = 0; i < array.length; i++){
    if (array[i] < mid){
      left.push(array[i]);

    } else {
      right.push(array[i]);

    }

  }
  left.push(mid)
  return quickSort(left).concat(quickSort(right));

}

console.log(quickSort([5,3,6,1,4]))
