function Person(n,c)
{
    this.name = n
    this.city =c
    this.show = function()
    {
        console.log(this.name)
    }
}

let p = new Person("qqq","www");
p.show();

// ---------arrow function----------
console.log("---------arraw function---------- ");
//we can assign a function to a variable
let f1 = function ()
{
    console.log("hello")
}


f1() //call the function using variable name

//assign fat arrow function to variable f1 
let f2 = ()=>{ console.log("test again")}

f2();


//------------------------------------------------------
console.log("");



