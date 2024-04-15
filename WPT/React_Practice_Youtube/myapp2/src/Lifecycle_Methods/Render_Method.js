
import React from'react';

export class Render_Method extends React.Component
{
    constructor()
    {
        super();
        this.state = { email : "shubham@test.com"} //first output
    }  

    render()
    {
        console.log("Call render()", this.state.email); 

        return(
            <>
               <h3>Render_Method Example</h3>
               {/* //second output - */}
               <button onClick={()=>this.setState({ email : "omkar@test.com" })}>Update</button> 
            </>
         
            
        )
    }
}