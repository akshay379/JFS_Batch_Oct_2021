
     var array1=['a','b','c'];
     var array2=[1,2,3];
     var l = array1.length + array2.length;
     var r=[];
     var k=0;
     var j=0;
     
     for(i=0;i<l;i++)
 {
     if(i%2==0){
         r[i] = array1[k];
         k++;
     }else{
 
         r[i] = array2[j];
         j++;
     }
 }
 document.getElementById("res").innerHTML += "["+r+"]";
 