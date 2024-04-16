
import { useEffect, useState } from "react"


export function Condition_with_UseEffect_Hook()
{
    const [data, setData] = useState(10);
    const [count, setCount] = useState(100);


    useEffect(()=>{
        console.log("UseEffect called for Data");    //this is called, when data is updates
    },[data])
    
    useEffect(()=>{
        console.log("UseEffect called for Count");    //this is called, when count is updates
    },[count])

    return(
        <div>
          <h1> UseEffect Hook Example</h1>
          <h3>Data : { data }</h3> 
          <button onClick={()=>setData(data + 1)}>Update Data</button>

          <h3>Count : { count }</h3>
          <button onClick={()=>setCount(count + 1)}>Update Count</button>
        </div>
    )
}