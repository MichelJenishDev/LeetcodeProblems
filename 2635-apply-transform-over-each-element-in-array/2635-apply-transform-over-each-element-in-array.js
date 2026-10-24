/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const t =[];
    arr.forEach((element,index) =>{
         t[index] = fn(element,index);
    });
    return t;
};