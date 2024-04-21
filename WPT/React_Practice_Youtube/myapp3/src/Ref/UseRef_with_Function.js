
import { useRef } from "react";

export function UseRef_with_Function()
{
    let inputRef = useRef(null);
    function getval()  
    {
        console.log("function call");
        console.log(inputRef.current.value); //get current value
         inputRef.current.style.color = "orange";
         inputRef.current.style.backgroundColor = "yellow";
    }

    return(
        <>
             <h2>Ref using useRef Hook with Function Example</h2>
             <input type="text" ref={inputRef}/><br/><br/>
             <button onClick={getval}>Check Ref</button>
        </>
    )
} 