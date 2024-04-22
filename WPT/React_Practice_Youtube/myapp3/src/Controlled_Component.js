import { useState } from "react"

export function Controlled_Component()
{
    let [val,setVal] = useState(0);

    return(
        <>
          <h3>Controlled Component Example</h3>
          <input type="text" value={val} onChange={(e)=>setVal(e.target.value)}/>
          <h3>Value : {val}</h3>
        </>
    )
}