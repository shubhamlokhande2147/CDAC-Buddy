import { useEffect, useState } from "react"


export function UseEffect_Hook()
{
    const [data, setData] = useState(0);

    useEffect(()=>{
        console.log("UseEffect called");    //this is called, when component is mount and update and also remove from mount
    })

    return(
        <div>
          <h1> UseEffect Hook Example</h1>
          <h3>Count : { data }</h3>
          <button onClick={()=>setData(data + 1)}>Update</button>
        </div>
    )
}