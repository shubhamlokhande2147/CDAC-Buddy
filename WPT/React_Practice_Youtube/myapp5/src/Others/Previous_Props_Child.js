import { useEffect, useRef } from "react"

export function Previous_Props_Child(props)
{
    const lastVal = useRef();

    useEffect(()=>{
        lastVal.current = props.count;
    })
     
    const prevValue = lastVal.current;

    return(
        <>

              <h3>Current Count : {props.count}</h3>
              <h3>Previous Count : {prevValue}</h3>
              {/* <h3>Difference : {props.count - prevValue }</h3> */}

        </>
    )
}