import { useState } from "react"

export function Previous_State()
{
   const [count,setCount] = useState(0);
   function updateCount()
   {
     //setCount(count + 1);
     let randm = Math.floor(Math.random() * 10);
     //setCount(randm)
     setCount((pre) => {
        //previous state is show on console
        console.log("previous state : ",pre)
        return randm;
     })
   }
    return(
        <>
          <h3>Previous State Example</h3>
          <h3>Count : { count }</h3>
          <button onClick={updateCount}>Update</button>
        </>
    )
}