import { useState } from "react"

export function UseState_Hook()
{
    const [data,setData] = useState("Shubham");
    return(
        <div>
            <h1>Hello {data}</h1>
            <button onClick={()=>setData("Omkar")}>Update</button>
        </div>
    )
}