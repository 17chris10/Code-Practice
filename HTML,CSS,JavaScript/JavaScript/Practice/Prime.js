let i;
let j;

console.log("Prime numbers between 1 to 50 are:");
for(i=1;i<=50;i++)
{
    let c=0;
    for(j=1;j<=i;j++)
    {
        if(i%j==0)
           c++;
    }
    if(c==2)
    console.log(i + " ");
}
