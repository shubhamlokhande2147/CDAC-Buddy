import { useEffect, useState } from "react"

export default function LifeCycleUsingFun(props)
{
    useEffect(()=>{

        console.log("Component is Mounting");
        return() => {console.log("Lifecycle is called unmounting")}
    },[])
 
    
    useEffect(()=>{
        console.log("props message is changed",props.msg)
    },[props.msg])
     

}