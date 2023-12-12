
let obj = {
             fname : "shubham",
             lname: "lokhande", 
             job : "Developer",
             address : {
                         area : "Malharpeth",
                         city : "Kolhapur",
                         state : "Maharashtra"
                        },
            skills : ["core java",".Net","C++","SDM"],
            show : function() { console.log(this.fname,this.job)}          
          } 


 console.log(obj.fname) 
 console.log(obj.address.area) 
 console.log(obj.skills)
 console.log(obj.skills[1])  
 
obj.show()
console.log(typeof(obj))
console.log(obj)         

console.log(JSON.stringify(obj))

let o1 = JSON.stringify(obj)
console.log(typeof(o1))