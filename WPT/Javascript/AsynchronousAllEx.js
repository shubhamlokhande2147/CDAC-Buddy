
console.log("-----asynchronous ex1 for print hi after 1 sec-------------")
let callback = ()=>{
    console.log("Hi Shubham");
}
setInterval(callback,1000);

//-----------------------------------------------------------
console.log("-----asynchronous ex2 for print hi after 1 sec-------------")

let callback1 = ()=>{
    console.log("Hello Shubham");
}  
setInterval(callback1,1000)
 

//-----------------------------------------------------------
console.log("-----asynchronous ex3 for set interval and time-------------")

let callback2 = ()=>{
    console.log("Bye Shubham");
} 

let intervalId = setInterval(callback2,1000);
setTimeout(()=>{
    console.log("settime out")
    clearInterval(intervalId)
},5000)
console.log("end program...!")
