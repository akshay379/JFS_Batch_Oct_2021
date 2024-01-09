var list=["Hello","world","in","a","frame"];
function myFun(list){
    let len=list.length;
    document.write("******"+"<br>");
    console.log("******");
    for(i=0;i<len;i++){
        console.log("*"+list[i]+"*");
        document.write("*"+list[i]+"*"+"<br>");
    }
    document.write("******"+"<br>");
    console.log("******");
}
myFun(list);