var singleNumber = function(nums) {
  var n = 0,
      l = nums.length;
  for(var i = 0; i < l; i++) {
    n = n^nums[i];
  }
  return n;
}

console.log(singleNumber([1]));
