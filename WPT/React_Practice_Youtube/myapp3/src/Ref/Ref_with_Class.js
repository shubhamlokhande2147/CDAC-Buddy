
import React,{createRef} from "react";

export class Ref_with_Class extends React.Component
{
    constructor()
    {
        super();
        this.inputRef = createRef();
    }

     getval()  
    {
        console.log(this.inputRef.current.value);
        this.inputRef.current.style.color = "orange";
        this.inputRef.current.style.backgroundColor = "yellow";
    }
    render()
    {
        return(
            <>
             <h2>Ref using Class Example</h2>
             <input type="text" ref={this.inputRef}/><br/><br/>
             <button onClick={()=>this.getval()}>Check Ref</button>
            </>
        )
    }
}