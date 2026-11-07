/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let num = [];
    for(let i =0;i<arr.length;i++){
        if(fn(arr[i],i)) num.push(arr[i]); 
    }
    return num;
};