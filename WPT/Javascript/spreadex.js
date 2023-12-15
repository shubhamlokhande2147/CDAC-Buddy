let obj={
    song:"Alone",
    singer:"Alan Walker",
    album:{
        movie:"none",
        year:2020
    }

}
//let obj2 = obj; // create two reference
//console.log(obj2);
//------------------------
//shallow copy
// let obj2= {...obj}
// obj2.song = "Gost"
// obj2.album.year = 2021 // year will change on both object as album have 2 reference pointing to same object use deep copy
// console.log(obj2,"\n",obj);

//deep copy 
let obj2= {...obj,album:{...obj.album}}
obj2.song = "Gost"
obj2.album.year = 2021 //year will be different as we have ended inner object album reference both album of obj will behave differnt
console.log(obj2,"\n",obj);

let arr = [10,20,30]
let arr2 = [5,arr]
console.log("length of arr2 is",arr2.length)

console.log(arr2[1][2])

let arr3 = [100,...arr]

console.log("length of arr2 is",arr3.length)

console.log(arr3[3])
