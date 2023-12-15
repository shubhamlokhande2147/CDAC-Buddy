import express from "express"
let app = express()
app.get('/',(req,res)=>{
    console.log("request arrived")
    res.send("Hi from server")

})

app.get("/getmsg",(req,res)=>{
    res.send("If you dream it You can Achieve it!")
})

app.post("/postmsg",(req,res)=>{
    res.send("Post it correctly")
})

app.put("/putmsg",(req,res)=>{
    res.send("put it away")
})
app.delete("/deletemsg",(req,res)=>{
    res.send("Delete it right now")
})

app.listen(7000,()=>{
    console.log("server is running on port 7000")
})