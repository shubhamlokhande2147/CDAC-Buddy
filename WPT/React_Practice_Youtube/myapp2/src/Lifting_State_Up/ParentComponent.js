import { useState } from "react";
import { ChildComponent } from '../Lifting_State_Up/ChildComponent'

export function ParentComponent()
{
    const [count,setCount] = useState(0);

    function increment()
    {
        setCount(count + 1);
    }

    return(
        <>
            <h2>Data Send to Child to Parant Component</h2>
            <h3>Count : { count }</h3>
            <ChildComponent incrementcount={ increment }/>
        </>
    )
}