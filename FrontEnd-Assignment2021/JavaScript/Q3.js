function parity(){
    var x = parseInt(document.getElementById ("first").value);
    var val;
    if(x%2==0){
        val="Even";
    }
    else{
        val="Odd";
    }
    document.getElementById("num").innerHTML=val;
}