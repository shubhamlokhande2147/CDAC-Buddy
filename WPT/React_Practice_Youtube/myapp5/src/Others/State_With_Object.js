import { useState } from "react"

export function State_With_Object()
{
    const [data,setData] = useState({name : 'Shubham' ,age : 24})
    return(
        <>
         <h3>State With Object Example</h3>

         {/* <input type="text" placeholder="Enter Name" onChange={(e)=>{setData({age : data.age ,name : e.target.value})}}/><br/><br/>
         <input type="text" placeholder="Enter Age" onChange={(e)=>{setData({name : data.name,age : e.target.value})}}/> */}

         {/* OR -  */}

         <input type="text" placeholder="Enter Name" onChange={(e)=>{setData({...data,name : e.target.value})}}/><br/><br/>
         <input type="text" placeholder="Enter Age" onChange={(e)=>{setData({...data,age : e.target.value})}}/>

         <h4>Name : {data.name}</h4>
         <h4>Age : {data.age}</h4>
        </>
    )
}