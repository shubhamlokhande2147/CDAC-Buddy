import { useState } from "react"


export function Hide_Show()
{

    const [data,setData] = useState(false);

    return(
        <div>
            <p>----------------------------------------------------------</p>
            {
                data ? <h2>Shubham Lokhande</h2> : <h2>Null</h2>

            }
            <h2>Hide & Show</h2>
             <button onClick={()=>setData(false)}>Hide</button><br/><br/>
             <button onClick={()=>setData(true)}>Show</button><br/><br/>
             <button onClick={()=>setData(!data)}>Toggle</button>
             <p>----------------------------------------------------------</p>

        </div>
    )
}