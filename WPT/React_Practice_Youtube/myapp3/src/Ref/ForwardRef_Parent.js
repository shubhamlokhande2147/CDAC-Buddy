
import { useRef } from 'react';
import ForwardRef_Child from './ForwardRef_Child';

export function ForwardRef_Parent()
{
    let inputRef = useRef(null);

     function updateInput()
     {
        console.log(inputRef.current.value); //get current value
        inputRef.current.style.color = "orange";
        inputRef.current.style.backgroundColor = "yellow";
        inputRef.current.focus(); //used to cursor in textbox
     }
    return(
        <>
         <h2>ForwardRef Parent Component</h2>
         <ForwardRef_Child ref={inputRef} />
         <button onClick={updateInput}>Update InputBox</button>
        </>
    )
}