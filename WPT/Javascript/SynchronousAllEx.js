
console.log("syncroexample");

function dojob(f1)
{
    for(let i=0;i<5;i++)
    {
         f1();
    }
}
dojob(function(){
 console.log("Hi Shubham");
})

console.log("---------------forEach()----------------")

let arr = [10,20,30,40,24]

//pass only element
arr.forEach((Element) => {
    console.log(Element)
 })
//pass element,arr,index
arr.forEach((Element,index,arr) => {
   console.log(Element,index,arr)
})


console.log("---------------map()----------------")

let arr1 = [12,23,70,34,65]

let square = arr1.map((Element) =>{
 
 return Math.pow(Element,2)

})
console.log("square =", square)


console.log("---------------filter()----------------")

let arr2 = [12,30,34,56,7788]

let diby4 = arr2.filter(function(element) {
 
    if(element %4 == 0)
    {
        return true;
    }
    else{
        return false;
    }
})
console.log("divide by 4 numbers = ",diby4)