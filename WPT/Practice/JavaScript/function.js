//pass function as a parameter
//to another function

function doJob(f1)
{
    for(var i=0;i<5;i++)
    {
        f1();
    }
}


doJob(function () {
    console.log("hi")
})

doJob(()=>{
    console.log("Shubham");
})

console.log("---------------------------")
test()
console.log("---------------------------")

//named function
function test()
{
    console.log("test")
}

doJob(test)

let v = function()
{
    console.log("bye")
}

doJob(v)


console.log("-------------------------------------------------")

function sayHi(choice,greeting)
{

    function indian(name)
    {
        console.log(greeting)
        console.log("namaste",name)
    }

    function US(name)
    {
        console.log("hi",name)
    }

    function Japanese(n)
    {
        console.log("konnichiwa",n)
    }

    switch(choice)
    {
        case 1 : return indian;break;
        case 2: return US; break;
        case 3: return Japanese;break;
        case 4: return (w)=>{console.log("Hola",w)} ; break;
    }
}


let rv = sayHi(1,"good morning")
console.log(typeof(rv))
rv("amit")
rv("nisha")






