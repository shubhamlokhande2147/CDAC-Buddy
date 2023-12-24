

let today = new Date();
console.log("Todays Date :" ,today);

console.log("Date : ",today.getDate());
console.log("Day : ",today.getDay());
console.log("Month : ",today.getMonth()+1);
console.log("Year : ",today.getFullYear());


let indDay = new Date(2000,5,17)
console.log("Day : ",indDay.getDay())

let yearEnd = new Date("2023-12-31")
console.log("year end : ",yearEnd.getDay())


let birthDate = new Date(2000,5,17)
let diff = today - birthDate
console.log(diff,"ms")