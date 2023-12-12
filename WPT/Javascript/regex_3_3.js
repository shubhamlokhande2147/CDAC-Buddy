

// let regex = /[A-za-z]*/
// let s = "Shubham"
// let rv = s.match(regex)
// console.log(rv)


//phone number

// let regex = /[0-9]{3}\-[0-9]{3}\-[0-9]{8}/
// let s = "091-020-12345678" //matched
// let rv = s.match(regex)
// console.log(rv)   


//email

// let regex = /[a-z]{1,10}\@gmail\.com/
// //let s = "dsf@df" //not matched
// let s = "dkjklsf@gmail.com" //matched
// let rv = s.match(regex)
// console.log(rv)   

//begin with char

// let regex = /^[A-Za-z_]/
// let s = "_ad091-020" //matched
// let rv = s.match(regex)
// console.log(rv)  

//date format

let regex = /[0-9]{2}\-[0-9]{2}\-[0-9]{4}/
let s = "99-99-0000" //matched
//let s = "08-08-01" not matched
let rv = s.match(regex)
console.log(rv)  