function makeAdder(x)
{
    return function(y)
             {return x + y;};
}
const add5 =makeAdder(5);
const add10 =makeAdder(10);
const add12 = makeAdder(12);

console.log(add5(2));
console.log(add10(2));
console.log(add12(1),add12(10))

console.log("--------------------------")

function counterFactory(seed){
    let cnt=seed
    function incrementor()
    {
        //let cnt =0
        return ++cnt
    }
    
    return incrementor
    }
    
    let incr = counterFactory(1000)
    console.log(incr(),incr(),incr())
    cnt=99
    console.log(incr())
    
    let incr1 = counterFactory(500)
    console.log(incr1(),incr1(),incr1(),incr1())
    