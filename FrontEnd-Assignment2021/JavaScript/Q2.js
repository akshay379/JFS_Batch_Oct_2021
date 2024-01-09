function sum()
{
    var n,i, sum = 0;
    n = parseInt(document.getElementById ("first").value);
    for (i = 1; i <= n; i++)
    {
        if(i%5==0 || i%3==0){
            sum = sum+i;
        }
    }
    document.getElementById ("num").innerHTML="Sum of "+n+ " natural numbers is :"+sum;
}