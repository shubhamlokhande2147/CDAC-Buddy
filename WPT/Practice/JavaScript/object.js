

let obj = {fname : "Shubham",
           lname : "Lokhande",
           dob : "17,04/2000",
           adddress : {
                       area : "Malharpeth",
                       city : "Kolhapur",
                       state : "Maharashtra",
                       pin : "416205"
                      },
           hobbies : ["Reading","Watching TV","Playing Cricket","Trecking"],
           show : function()
           {
            console.log("First Name : ",this.fname)
           }
         
        };


console.log(obj.fname);
console.log(obj.adddress.city);
console.log(obj.hobbies[3]);

//ANOTHER WAY to access properties  
console.log(obj["fname"])
// console.log(obj["address"])
// console.log(obj["address"])

obj.show();

console.log(typeof(obj.show))
console.log(typeof(obj))


let rv = JSON.stringify(obj)
console.log(typeof(rv))
console.log(rv.fname)

let o =JSON.parse(rv)
console.log(typeof(o), o.fname)
