import { useState } from "react"

import { Previous_Props_Child } from './Previous_Props_Child'


export function Previous_Props_Parent()
{
    const [count, setCount] = useState(0);

    return(
        <>
             <h2>Previous Props Example</h2>

             <Previous_Props_Child count={count}/>
             <button onClick={()=>{setCount(count + 1 )}}>Update</button>

        </>
    )
}