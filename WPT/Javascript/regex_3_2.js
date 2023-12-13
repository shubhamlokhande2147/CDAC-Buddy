// let regex = /abc/
// let s = "pqrabc"
// let rv = s.match(regex)
// console.log(rv)

// let regex = /abc/i  case insenstive
// let s = "PQRSTABC"
// let rv = s.match(regex)
// console.log(rv)

// let regex = /[a-z]/ // range 
// let s = "BIGSIhgfhsgh"
// let rv = s.match(regex)
// console.log(rv)

// let regex = /[A-Z a-c]/ // range 
// let s = "3483748fjqaegfj9658"
// let rv = s.match(regex)
// console.log(rv)

// let regex = /[A-Z a-c]/ // range 
// let s = "3483748fjqaegfj9658"
// let rv = s.match(regex)
// console.log(rv)

// let regex = /^[A-Z] [a-z]+/ // start with captital and continue with all ato z
// let s = "gsfjABCehgirh"
// let rv = s.match(regex)
// console.log(rv)    //null not matched

// let regex = /^[A-Z][a-z]+/ // start with captital and continue with all ato z [+ one or more]
// let s = "India Harsh"
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /^[A-Z][a-z]*/ // start with captital and continue with all ato z [* o or more]
// let s = "I" //let s="India"
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /[A-Z][a-z]+[0-9]{3}/ // start with captital and continue with all ato z
// let s = "Ind250"
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /[A-Z][a-z]+[0-9]{3}$/ // start with captital and continue with all ato z
// let s = "Ind250"
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /[A-Z][a-z]+[0-9]{0,3}$/ // start with captital and continue with all ato z and [$ end with]
// let s = "Ind250"
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /[A-Z][a-z]+[0-9]{0,3}.com/ // start with captital and continue with all ato z //{min,max}
// let s = "Ind250.com"  
// let rv = s.match(regex)
// console.log(rv)    // matched

// let regex = /[a-z]+[0-9]{2,3}\.com/ // start with captital and continue with all ato z //{min,max}  \. means only . will be accepted
// let s = "harshwa007.com"  
// let rv = s.match(regex)
// console.log(rv)    // matched

let regex = /[-_#@]/ // start with captital and continue with all ato z //{min,max}
let s = "0-iuwrgt"  
let rv = s.match(regex)
console.log(rv)    // matched


// let regex = /[-_#@]/ 
// let s ="#"
// let rv =s.match(regex)
// console.log(rv)

