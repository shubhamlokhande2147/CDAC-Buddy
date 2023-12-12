var n = 4;

//if condition
if(n%2==0)
{
    console.log(n ,"even")
}
else
{
    console.log(n ,"odd")
}

//switch
switch(n)
{
    case 1: console.log("one");break;
    case 2: console.log("two")
            break
    default : console.log("not 1 or 2")
              break;
}


//while loop
 let a=1
while(a <= 10)
 {
    console.log(a)
    a++;
 }

//do--while loop
 let b=2;
 do{
    console.log(b)
    b++
 }while(b<10)

 //for loop
 for(let i=0;i<n;i++)
 {
    console.log("i ",i)
 }