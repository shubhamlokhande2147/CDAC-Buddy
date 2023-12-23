console.log("Hello Shubham......");

let x;
x=`this is a long string
with new lines use backquotes 
for multiline strings`;
console.log(x);

x="Shubham"
console.log(x);
console.log(typeof(x));

x=["omker",12,34,45,45];
console.log(x);
console.log(typeof(x));

//let,var ,const
let p1=20;
console.log(p1);
console.log(typeof(p1));

var p2="asas";
console.log(p2);
console.log(typeof(p2));

const p3={"name":"vivek","city":"kolhapur"};
console.log(p3);
console.log(typeof(p3));


//if-else,for,while loop //use also swith,while loop


let a=3;
if(a>=5)
{
    console.log("Greater",a);
}
else
{
    console.log("smaller",a)
}

for(let b=1;b<=5;b++)
{
    console.log("The number is : " + b)
}


a=1
do{
 console.log(a++)
}while(a < 10)


//function
function add(num1,num2)
{
    return num1 + num2;
}

let result = add(4,5);
console.log("Addition : " + result)

//----------------------------------------------
//REST Parameters = Variable args 
//only one rest parameter for a func
//rest parameters will be last arg
function adddition(...nums)
{
    let sum=0;
    for(i=0;i<nums.length;i++)
    {
        sum = sum + nums[i];
    }
    console.log("Addition : " + sum)
    return sum;
}

function total(...nums)
{
    let sum =0
    for(let i=0;i<nums.length;i++)
    {
        sum=sum+nums[i]
    }
    return sum
}

console.log("Addition : " + total(1,2,3,4,5,6))

let result3 = adddition(4,5,3,34,5,5);
console.log("Addition : " + result3)

//default parameter
function add(num1=10,num2=10)
{
    return num1 + num2;
}

let result4 = add();
console.log("Default Addition : " + result4)
