import { useState } from "react"

export function HOC_Component()
{
    return(
        <>
          <h2>High Order Component Example</h2>
          {/* //simple Counter Component -  */}
          <Counter/> 

          {/* //pass Counter Component as a props -  */}
          <HOC_Red cmp = {Counter}/>  
          <HOC_Green cmp = {Counter}/>
          <HOC_Blue cmp = {Counter}/>
          
        </>
    )
}

function Counter()
{  
     let [count,setCount] = useState(0);
    return(
        <>
          <h3>Count : {count}</h3>
          <button onClick={()=>setCount(count + 1 )}>Update</button>
        </>
    )
}

function HOC_Red(props)
{ 
    //apply new fuctionality to counter component - 
    return(
        <h2 style={{backgroundColor : "red", width : 200}}>Red : <props.cmp/></h2>
    )
}

function HOC_Green(props)
{
    //apply new fuctionality to counter component - 
    return(
        <h2 style={{backgroundColor : "green", width : 200}}>Red : <props.cmp/></h2>
    )
}

function HOC_Blue(props)
{
    //apply new fuctionality to counter component - 
    return(
        <h2 style={{backgroundColor : "blue", width : 200}}>Red : <props.cmp/></h2>
    )
}