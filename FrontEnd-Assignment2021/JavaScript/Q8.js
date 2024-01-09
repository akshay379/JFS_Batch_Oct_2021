var array1=[1,2,3,4];
var array2=['a','b','c','d'];
function concate(a1,a2){
    var array=a1.concat(a2);
    console.log(array);
    return array;
}
document.write(concate(array1,array2));