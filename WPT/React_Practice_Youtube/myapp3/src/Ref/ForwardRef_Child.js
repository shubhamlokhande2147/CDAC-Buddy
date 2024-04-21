
import React,{forwardRef} from "react";

function ForwardRef_Child(props,ref)
{
    return(
        <>
         <h2>ForwardRef Child Component</h2>
         <input type="text" ref={ref}/>
        </>
    )
}

export default forwardRef(ForwardRef_Child);