
export function Click_Event()
{
    function apple()
    {
        alert("Give me apple")        
    }
    function apple2()
    {
        alert("Using Arrow function")        
    }
    return(
     <div>
        <p>---------------------------------------------------</p>
        <h4>Click_Event</h4>
        <button onClick={apple}>Please Click Me</button><br/><br/>
        <button onClick={()=>apple2()}>Please Click Me</button><br/><br/>
        <button onClick={()=>alert("Direct call alert")}>Direct call alert</button>  
     </div>    
   
    )
}