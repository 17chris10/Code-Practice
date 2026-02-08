var i,sum=0;
function perfect(n)
{
    for(i=1;i<n;i++)
    {
        if(n%i==0)
            sum+=i;
    }
    if(sum==n)
        return 1;
    else
        return 0;
}
function palindrome(n3)
{
    let num=n3,rev=0;
    let d;
    while(num>0)
    {
        d=num%10;
        rev=(rev*10)+d;
        num=Math.floor(num/10);
    }
    if(rev==n3)
        return 1;
    else
        return 0;
}
let n1=6;
let n2=202;
if(perfect(n1))
    console.log("Perfect no.");
else
    console.log("Not a perfect no.");

if(palindrome(n2))
    console.log("palindrome no.");
else
    console.log("Not a palindrome no.");