import express from "express"

let app = express()
app.get("/",(req,res)=>{
    console.log("request arrived")
    res.send("Hi from Server...")
})


app.listen(7000,()=>{
    console.log("Server running on port 7000....")
})